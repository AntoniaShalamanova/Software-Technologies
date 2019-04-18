function extractCapitalCaseWords(arr) {
    let words = arr.join(', ').split(/\W+/);
    words = words.filter(w => w !== '');

    let capitalCaseWords = words.filter(isCapitalCaseWord);

    console.log(capitalCaseWords.join(', '));

    function isCapitalCaseWord(word) {
        return word === word.toUpperCase();
    }
}

extractCapitalCaseWords(['We start by HTML, CSS, JavaScript, JSON and REST. Later we touch some PHP, MySQL and SQL. Later we play with C#, EF, SQL Server and ASP.NET MVC. Finally, we touch some Java, Hibernate and Spring.MVC']);