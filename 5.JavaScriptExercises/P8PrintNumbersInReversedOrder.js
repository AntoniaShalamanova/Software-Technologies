function printReversedNums(nums) {
    nums = nums.reverse();

    for (let numb of nums) {
        console.log(numb);
    }
}

printReversedNums([10, 15, 20]);