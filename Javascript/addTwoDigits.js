// take digits as string and find the sum of all of them
function addTwoDigits(num)  {
    var strNumArr = num.toString().split("");
    
    var total = 0;
    for (let i=0; i<strNumArr.length; i++) {
        total = total + parseInt(strNumArr[i]);
    }
    return total;
}

/**
* Test Suite 
*/
const num = 29;
const result = addTwoDigits(num);
console.log("result: ", result);
