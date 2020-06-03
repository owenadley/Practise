function firstDuplicate(nums) {
    //  write code here.
    var shortest = null;
    var num = -1;
    
    for (let i=0; i<nums.length-1; i++) {
        for (let j=i; j<nums.length; j++) {
            if (i != j) {
                if (nums[i] == nums[j]) {
                    if (j < shortest) {
                        shortest = j
                        num = nums[j];                        
                    } else if (shortest == null) {
                        shortest = j
                        num = nums[j];
                    }
                }
            }
        }
    }
    return num;
}



/**
* Test Suite 
*/
const nums = [2, 1, 3, 5, 3, 2];
const result = firstDuplicate(nums);
console.log("result 1: ", result);
   
const nums = [2, 1, 3, 5, 4, 6];
const result = firstDuplicate(nums);
console.log("result 2: ", result);
