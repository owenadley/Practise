function sumAllPrimes(num) {
    var total = 0;
    for (let i=2; i<=num; i++) {
        var isPrime = true;
        for (let j=2; j<=Math.sqrt(i); j++) {
            if (i%j == 0 && i!=j) {
                isPrime = false;
                break;
            }
        }
        isPrime ? total += i : null;
    }
    return total;    
}


/**
* Test Suite 
*/
const num = 977;
const result = sumAllPrimes(num);
console.log("result: ", result);
console.log(result == 73156);

