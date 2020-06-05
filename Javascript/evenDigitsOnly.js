
function evenDigitsOnly(number) {
    // using every
    return number.toString().split("").every(num => parseInt(num) % 2 == 0)
}


function evenDigitsOnlyTwo(number) {
    //  not using every
    var test = number.toString().split("");
    for (let i=0; i<test.length; i++) {
        if (parseInt(test[i])%2 !== 0) {
            return false
        } 
    }
    return true;
}


/**
* Test Suite 
*/

const nums = 248622;
const result = evenDigitsOnly(nums);
console.log("result 1 : ", result);


const nums = 642386;
const result = evenDigitsOnly(nums);
console.log("result 2 : ", result);
expect(result).toBe(false);
