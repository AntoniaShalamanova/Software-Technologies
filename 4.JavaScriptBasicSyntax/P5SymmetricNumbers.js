function symmetricNums(nums) {
    let numb = Number(nums[0]);
    let result = '';

    for (let currentNumb = 1; currentNumb <= nums; currentNumb++) {
        if (isSymmetric(currentNumb.toString())) {
            result += currentNumb.toString() + ' ';
        }
    }

    console.log(result);

    function isSymmetric(currentNumb) {
        for (let digit = 0; digit < currentNumb.length / 2; digit++) {
            if (currentNumb[digit] !== currentNumb[currentNumb.length - 1 - digit]) {
                return false;
            }
        }
        return true;
    }
}

symmetricNums(['750']);