function printObjects(inputs) {
    for (let studentInfo of inputs) {
        let studentObj = JSON.parse(studentInfo);

        console.log(`Name: ${studentObj.name}`);
        console.log(`Age: ${studentObj.age}`);
        console.log(`Date: ${studentObj.date}`);
    }
}

printObjects(['{"name":"Gosho","age":10,"date":"19/06/2005"}', '{"name":"Tosho","age":11,"date":"04/04/2005"}']);