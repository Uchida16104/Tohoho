alert("Hello world!!");
console.log("Hello world!!");
window.open("about:blank", "_blank");
const abc123 = 123;
var x = 5;
let y = 3;
alert(x + y);
var a = 3;
let b = 3;
console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);
console.log(a % b);
console.log(a ** b);
{
  var c = 5;
  let d = 5;
}
console.log(c);
console.log(d);
for (let i = 0; i < 10; i++) {
  console.log(i);
}
let n = 20;
if (n < 10) {
  alert("Small!");
} else if (n > 20) {
  alert("Big!");
} else {
  alert("Normal");
}
var k = 10;
switch (k) {
case 1:
  alert("One");
  break;
case 2:
  alert("Two");
  break;
case 3:
case 4:
  alert("Three or Four");
  break;
default:
  alert("Other");
  break;
}
let j = 0;
while (j < 10) {
  console.log(j);
  j++;
}
let t = 0;
do {
  console.log(t);
  t++;
} while (t < 10);
var data = { name: "Yamada", age: 26, country: "Japan" };
for (var d in data) {
  console.log(d, data[d]);
}
for (var attr in navigator) {
  console.log(attr);
}
for (var s = 0; s < 50; s++) {
  if (s == 5) {
    break;
  }
  console.log(s);
}
abc:
  for (var f = 0; f < 10; f++) {
    for (var g = 0; g < 10; g++) {
      let xx = f * 10 + g;
      if (xx > 20) {
        break abc;
      }
      console.log(xx + "<br>");
    }
  }
def:
  for (var p = 0; p < 10; p++) {
    for (var q = 0; q < 10; q++) {
      let rr = p * 10 + q;
      if (rr == 55) {
        continue def;
      }
    }
  }
//debugger;
with (document) {
  console.log(x);
  console.log(y);
}
function func() {
  console.log(document.jap.ch1.value);
  console.log(Number(document.safe.ch2.value));
}
let zz;
let yy = (!(zz >= 5)) ? "big" : "small";
bit1=0x12345678 << 8;
bit2=0x12345678 >> 8;
bit3=0x87654321 >>> 8;
let xx = 0;
xx += 5;
xx -= 5;
xx *= 5;
xx /= 5;
xx %= 5;
xx **= 5;
xx &= 0xff;
xx |= 0xff;
xx ^= 0xff;
xx <<= 8;
xx >>= 8;
xx >>>= 8;
xx ||= 5;
xx &&= 5;
xx ??= 5;
var obj = {
  name: "Yamada",
  age: 24
};
console.log(obj.name);
delete obj.name;
console.log(obj.name);
function typeReturn(input){
  return typeof(input);
}
console.log(typeReturn(true));
test = {
  name:"Gurung",
  age:26
};
if ("name" in test) {
  console.log("Ho");
}
function Person() {}
var p1 = new Person();
if (p1 instanceof Person) {
  console.log("Ho");
} else {
  console.log("Hoina");
}
var e = {x:123, y:456};
delete e.x;
class MyClass {
  func() { console.log(this); }
}
var object = new MyClass();
object.func();
var obj = { name: "Tanaka", age: 26 };
var a1 = obj;	
var a2 = new WeakRef(obj);
console.log(a1);
console.log(a2.deref());
function search(input){
  return escape(input);
}
console.log(search("こんにちは。"));
console.log(unescape("%%abac%bf"));
