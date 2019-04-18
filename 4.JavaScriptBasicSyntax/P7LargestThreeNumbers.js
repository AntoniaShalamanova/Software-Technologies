function getLargestThreeNums(nums) {
    nums = nums.sort((n1, n2) => n2 - n1);
    let count = Math.min(3, nums.length);

    for (let i = 0; i < count; i++) {
        console.log(nums[i]);
    }
}

getLargestThreeNums(['10', '30', '15', '20', '50', '5']);