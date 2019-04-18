function changeArray(inputs) {
    let arr = [];

    for (let input of inputs) {
        input = input.split(' ');
        let command = input[0];

        if (command === 'add') {
            let value = Number(input[1]);
            arr.push(value);
        }
        else if (command === 'remove') {
            let indx = Number(input[1]);

            if (indx < arr.length) {
                arr.splice(indx, 1);
            }
        }
    }

    for (let numb of arr) {
        console.log(numb);
    }
}

changeArray(['add 3', 'add 5', 'remove 1', 'add 2']);