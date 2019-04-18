function printValues(inputs) {
    let obj = {};

    for (let i = 0; i < inputs.length - 1; i++) {
        input = inputs[i].split(' ');
        let key = input[0];
        let value = input[1];

        if (key in obj === false) {
            obj[key] = [];
        }
        obj[key].push(value);
    }

    let givenKey = inputs[inputs.length - 1];

    if (givenKey in obj) {
        console.log(obj[givenKey].join('\n'));
    }
    else {
        console.log('None');
    }

}

printValues(['key value', 'key eulav', 'test tset', 'key']);