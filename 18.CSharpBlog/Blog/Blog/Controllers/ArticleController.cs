using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using Blog.Data;
using Blog.Models;
using Microsoft.AspNetCore.Authorization;

namespace Blog.Controllers
{
    public class ArticleController : Controller
    {
        private readonly ApplicationDbContext _context;

        public ArticleController(ApplicationDbContext context)
        {
            _context = context;
        }

        private bool IsUserAuthorizedToEdit(Article article)
        {
            bool isAdmin = this.User.IsInRole("Admin");
            bool isAuthor = article.IsAuthor(this.User.Identity.Name);

            return isAdmin || isAuthor;
        }

        //
        //GЕT: Article
        public ActionResult Index()
        {
            return RedirectToAction("List", "Article");
        }

        //GET: Article/List
        public ActionResult List()
        {
            var articles = _context
                .Articles
                .Include(a => a.Author)
                .ToList();

            return View(articles);
        }

        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return StatusCode(500);
            }

            var article = _context
                .Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (article == null)
            {
                return StatusCode(500);
            }

            return View(article);
        }

        // GET: Article/Create
        [Authorize]
        public ActionResult Create()
        {
            return View();
        }

        // POST: Article/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [Authorize]
        public ActionResult Create(Article article)
        {
            if (ModelState.IsValid)
            {
                //get user id
                var authorId = _context
                    .Users
                    .Where(u => u.UserName == this.User.Identity.Name)
                    .First()
                    .Id;

                //set article author
                article.AuthorId = authorId;

                //save article
                _context.Articles.Add(article);
                _context.SaveChanges();

                return RedirectToAction("Index");
            }

            return View(article);
        }

        // GET: Article/Edit/5
        public IActionResult Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            // Get article from database
            var article = _context
                .Articles
                .Include(a=>a.Author)
                .Where(a => a.Id == id)
                .First();

            if (IsUserAuthorizedToEdit(article) == false)
            {
                return Forbid();
            }

            // Check if article exists
            if (article == null)
            {
                return NotFound();
            }

            // Create the view model
            var model = new ArticleViewModel();
            model.Id = article.Id;
            model.Title = article.Title;
            model.Content = article.Content;

            // Pass the model to view
            return View(model);
        }

        // POST: Article/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(ArticleViewModel model)
        {
            if (ModelState.IsValid)
            {
                // Get the article
                var article = _context
                 .Articles
                 .FirstOrDefault(a => a.Id == model.Id);

                // Set new properties
                article.Title = model.Title;
                article.Content = model.Content;

                // Save changes
                _context.Update(article);
                _context.SaveChanges();

                // Redirect to index
                return RedirectToAction("Index");
            }

            return View(model);
        }

        // GET: Article/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = _context
                .Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (IsUserAuthorizedToEdit(article) == false)
            {
                return Forbid();
            }

            if (article == null)
            {
                return StatusCode(404);
            }

            return View(article);
        }

        // POST: Article/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            //Get Article
            var article = _context
                .Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            //Check if article exists
            if (article == null)
            {
                return NotFound();
            }

            //Delete Article
            _context.Articles.Remove(article);
            _context.SaveChanges();

            //Redirect to index page
            return RedirectToAction("Index");
        }

        private bool ArticleExists(int id)
        {
            return _context.Articles.Any(e => e.Id == id);
        }
    }
}
