// slow solution: O (n^2)
function addBorder(array) {
    //  write code here.
    let bordered = [];
    var topbot = "";
    for (let i=0; i<array[0].length+2; i++) {
        topbot = topbot.concat("*");
    }
    var temp = "";
    var star = "*"
     for (let i=0; i<array.length; i++) {
        for (let j=0; j<array[i].length; j++) {
            j==0 ? temp = star.concat(array[i]) : null
            j==array[i].length-1 ? temp = temp.concat(star) : null
        }
        bordered.push(temp)
    } 
    bordered.unshift(topbot);
    bordered.push(topbot);
    return bordered;
}

// much faster solution: O(n)
function addBorderTwo(array) {
    const wall = "*".repeat(array[0].length+2)
    console.log("wall " + wall )
    array.unshift(wall);
    array.push(wall);
    for (let i=1; i<array.length-1; i++) {
        array[i] = "*".concat(array[i], "*")
    }
    return array;
}

/**
* Test Suite 
*/

const strings = ['abc', 'ded'];
const result = addBorder(strings);
const result2 = addBorderTwo(strings);
console.log("result: ", result2);

/* expect(result).toEqual(
        ["*****",
        "*abc*",
        "*ded*",
        "*****"]
); */
