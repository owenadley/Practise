/* 

var obj = {
    name: 'Owen',
    log: () => {
        console.log(this.name);
    },
    log2: function() {
        console.log(this.name);
    }
}
//obj.log();
//obj.log2();

const test = obj.log2;
console.dir(test)

function Bear(type) {
    console.log(this);
}
var abc123 = function () {
    console.log('lol')
}
function abc() {
    console.log('lol')
}

var grizz = new Bear(); // bear object
var grizz2 = Bear();    // global object

console.log(typeof(abc123))
console.log(typeof(abc.prototype))

boop(); // hoisted
console.log(booped)

function boop() {
    console.log('get booped!');
}
var booped = "gotem"
boop();

boopy = "gotem2"
var booper
console.log(booper)

x;
console.log(x)


var x = [1, 2, 3, 4, 5];
console.log(x[-1]);

var x = null;
console.log(typeof(x));

// closeure example
var passed = 3;
var addTo = function () {
    var inner = 2;
    return passed + inner;
}
console.dir(addTo);

// this function, returns the add function
// the 'passed' argument will be used in the add function, and inner will not be defined
var addToo = function(passed) {

    var add = function(inner) {
        return passed + inner;
    }
    return add;
}

var addThree = new addToo(3);
var addFour = new addToo(4);

console.log('break');

console.log(addThree);
console.log(addThree(1));
console.log(addFour(1));


 */

console.log(false && "lol");
console.log(1 || "R");
console.log(1 == 'true');