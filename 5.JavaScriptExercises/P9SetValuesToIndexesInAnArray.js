function printArray(input) {
    let arrLength = Number(input[0]);
    let arr = new Array(arrLength).fill(0);


    for (let i = 1; i < input.length; i++) {
        let indx = Number(input[i].split(' - ')[0]);
        let value = Number(input[i].split(' - ')[1]);

        arr[indx] = value;
    }

    for (let numb of arr) {
        console.log(numb);
    }
}

printArray(['5', '0 - 3', '3 - -1', '4 - 2']);