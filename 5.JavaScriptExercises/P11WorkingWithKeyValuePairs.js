function printValue(inputs) {
    let obj = {};

    for (let i = 0; i < inputs.length - 1; i++) {
        input = inputs[i].split(' ');
        let key = input[0];
        let value = input[1];

        obj[key] = value;
    }

    let givenKey = inputs[inputs.length - 1];

    if (givenKey in obj) {
        console.log(obj[givenKey]);
    }
    else{
        console.log('None');
    }

}

printValue(['key value', 'key eulav', 'test tset', 'key']);