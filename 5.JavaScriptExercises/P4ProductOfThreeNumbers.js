function getProduct(numbs) {
    let numbers = numbs.map(Number).filter(n => n < 0);

    let negativeNumsCount = numbers.length;

    if (negativeNumsCount % 2 === 0) {
        console.log('Positive');
    }
    else {
        console.log('Negative');
    }
}

getProduct(['3', '2', '1']);