function printJSON(inputs) {
    let obj = {};

    for (let input of inputs) {
        input = input.split(' -> ');
        let key = input[0];
        let value = input[1];

        if (isNaN(value) === false) {
            value = Number(input[1]);
        }

        obj[key] = value;
    }

    console.log(JSON.stringify(obj));
}

printJSON(['name -> Angel', 'surname -> Georgiev', 'age -> 20', 'grade -> 6.00', 'date -> 23/05/1995', 'town -> Sofia']);