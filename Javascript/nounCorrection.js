// runtime: O(n), 0.016s
//function properNounCorrection(str) {
//     //  write code here.
//     var temp = str.split("")
//     for (let i=0; i<str.length; i++) {
//         if (i==0) {
//             if (str.charAt(0) == str.charAt(0).toLowerCase()) {
//                 temp[0] = str.charAt(0).toUpperCase()
//             } 
//         } else if (str.charAt(i) == str.charAt(i).toUpperCase()) {
//             temp[i] = str.charAt(i).toLowerCase()
//         }
//     }
//     return temp.join("");
// }

//runtime O(n), 0.013s
function properNounCorrection(str) {
    temp = str.toLowerCase().split("")
    temp[0] = temp[0].toUpperCase()
    return temp.join("")
}


/**
* Test Suite 
*/
const str = 'pARiS';
const result = properNounCorrection(str);
console.log("result 1: ", result);

const str = 'John';
const result = properNounCorrection(str);
console.log("result 2: ", result);