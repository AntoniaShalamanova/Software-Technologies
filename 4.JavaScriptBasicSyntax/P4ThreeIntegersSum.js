function threeIntegersSum(arr) {
    let nums = arr[0].split(' ').map(Number);
    let num1 = nums[0];
    let num2 = nums[1];
    let num3 = nums[2];

    console.log(
        check(num1, num2, num3) ||
        check(num1, num3, num2) ||
        check(num2, num3, num1) ||
        'No'
    );

    function check(n1, n2, sum) {
        if (n1 + n2 !== sum) {
            return false;
        }
        if (n1 > n2) {
            [n1, n2] = [n2, n1];
        }
        return `${n1} + ${n2} = ${sum}`;
    }
}

threeIntegersSum('8 15 7');