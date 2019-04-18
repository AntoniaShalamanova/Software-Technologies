namespace ProjectRider.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using ProjectRider.Models;
    using System.Linq;

    public class ProjectController : Controller
    {
        private readonly ProjectDbContext context;

        public ProjectController(ProjectDbContext context)
        {
            this.context = context;
        }

        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            // TODO
            var projects = context
                .Projects
                .ToList();

            return View(projects);
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            // TODO
            return View();
        }

        [HttpPost]
        [Route("create")]
        public ActionResult Create(Project project)
        {
            // TODO
            this.context.Projects.Add(project);
            this.context.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            if (id == null)
            {
                return NotFound();
            }

            // TODO
            var project = context
                .Projects
                .FirstOrDefault(p => p.Id == id);

            if (project == null)
            {
                return NotFound();
            }

            return View(project);
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Project projectModel)
        {
            // TODO
            context.Projects.Update(projectModel);
            context.SaveChanges();

            return RedirectToAction("Index");
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int id)
        {
            // TODO
            if (id == null)
            {
                return NotFound();
            }

            var project = context
                .Projects
                .FirstOrDefault(p => p.Id == id);

            if (project == null)
            {
                return StatusCode(404);
            }

            return View(project);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int id, Project projectModel)
        {
            // TODO
            context.Projects.Remove(projectModel);
            context.SaveChanges();

            return RedirectToAction("Index");
        }
    }
}
