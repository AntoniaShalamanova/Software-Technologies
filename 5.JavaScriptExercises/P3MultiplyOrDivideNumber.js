function multiplyOrDIvideNumbers(numbs) {
    let num1 = Number(numbs[0]);
    let num2 = Number(numbs[1]);

    if (num1 <= num2) {
        console.log(num1 * num2);
    }
    else {
        console.log(num1 / num2);
    }
}

multiplyOrDIvideNumbers(['3', '2']);