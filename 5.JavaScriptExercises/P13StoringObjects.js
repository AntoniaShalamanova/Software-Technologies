function printObjects(inputs) {
    let students = [];

    for (let studentInfo of inputs) {
        studentInfo = studentInfo.split(' -> ');

        let name = studentInfo[0];
        let age = Number(studentInfo[1]);
        let grade = Number(studentInfo[2]);
        let student = {};

        student.name = name;
        student.age = age;
        student.grade = grade;
        students.push(student);
    }

    for (let student of students) {
        console.log(`Name: ${student.name}`);
        console.log(`Age: ${student.age}`);
        console.log(`Grade: ${student.grade.toFixed(2)}`);
    }
}

printObjects(['Pesho -> 13 -> 6.00', 'Ivan -> 12 -> 5.57', 'Toni -> 13 -> 4.90']);