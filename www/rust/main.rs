struct Point {
    x: i32,
    y: i32,
}
fn main1() {
    let p = Point { x: 100, y: 200 };
    println!("{} {}", p.x, p.y);
}
union MyUnion {
    f1: u32,
    f2: u32,
}
fn main2() {
    let u = MyUnion { f1: 123 };
    unsafe {
        println!("{}", u.f1);
        println!("{}", u.f2);
    }
}
enum Color {
    Red,
    Green,
    Blue,
}
let color = Color::Red;
let tup = (10, "20", 30);
println!("{} {} {}", tup.0, tup.1, tup.2);
let arr = [10, 20, 30];
println!("{} {} {}", arr[0], arr[1], arr[2]);
for v in &arr {
    println!("{}", v);
}
let mut vect = vec![10, 20, 30];
vect.push(40);
println!("{} {} {} {}", vect[0], vect[1], vect[2], vect[3]);
for v in &vect {
    println!("{}", v);
}
use std::collections::HashMap;
let mut map = HashMap::new();
map.insert("x", 10);
map.insert("y", 20);
map.insert("z", 30);
println!("{} {} {}", map["x"], map["y"], map["z"]);
for (k, v) in &map {
    println!("{} {}", k, v);
}
let mut name: &str = "Yamada";
name = "Tanaka";
let mut name = String::from("Yamada");
name = "Tanaka".to_string();
name.push_str(" Taro");
struct Point {
    x: i32,
    y: i32,
}
fn main3() {
    let p: Box<Point> = Box::new(Point { x: 100, y: 200 });
    println!("{} {}", p.x, p.y);
}
impl Drop for Point {
    fn drop(&mut self) {
        println!("Bye!");
    }
}
let s = String::from("ABCDEFGH");
let s1 = &s[0..3];
let s2 = &s[3..6];
println!("{} {}", s1, s2);
let a = [10, 20, 30, 40, 50, 60, 70, 80];
let a1 = &a[0..3];
let a2 = &a[3..6];
println!("{:?} {:?}", a1, a2);
fn add(x: i32, y: i32) -> i32 {
    return x + y;
}
fn add(x: i32, y: i32) -> i32 {
    x + y
}
let square = | x: i32 | {
    x * x
};
println!("{}", square(9));
let msg = String::from("Hello");
let func = move || {
    println!("{}", msg);
};
func();
macro_rules! log {
    ($x:expr) => { println!("{}", $x); }
}
fn main5() {
    log!("ABC...");
}
if n == 1 {
    println!("One");
} else if n == 2 {
    println!("Two");
} else {
    println!("Other");
}
let mut n = 0;
while n < 10 {
    n += 1;
}
for i in 0..10 {
    println!("{}", i);
}
let mut n = 0;
loop {
    n += 1;
    if n == 10 {
        break;
    }
}
let mut n = 0;
loop {
    n += 1;
    if n == 2 {
        continue;
    }
    if n == 8 {
        break;
    }
    println!("{}", n);
}
let x = 2;
match x {
    1 => println!("One"),
    2 => println!("Two"),
    3 => println!("Three"),
    _ => println!("More"),
}
struct Rect { width: u32, height: u32 }
impl Rect {
    fn area(&self) -> u32 {
        self.width * self.height
    }
}
fn main6() {
    let r = Rect { width: 200, height: 300 };
    println!("{}", r.area());
}
struct Rect { width: u32, height: u32 }
trait Printable { fn print(&self); }
impl Printable for Rect {
    fn print(&self) {
        println!("width:{}, height:{}", self.width, self.height)
    }
}
fn main7() {
    let r = Rect { width: 200, height: 300 };
    r.print();
}
struct Rect<T> { width: T, height: T, }
trait Printable { fn print(&self); }
impl<T> Printable for Rect<T> where T: std::fmt::Display {
    fn print(self: &Rect<T>) {
        println!("{}x{}", self.width, self.height);
    }
}
fn main8() {
    let r1: Rect<i32> = Rect{ width: 100, height: 200 };
    let r2: Rect<i64> = Rect{ width: 100, height: 200 };
    r1.print();
    r2.print();
}
use std::boxed::Box;
struct Dog {}
struct Cat {}
trait Animal { fn cry(&self); }
impl Animal for Dog { fn cry(&self) { println!("Bow-wow"); } }
impl Animal for Cat { fn cry(&self) { println!("Miaow"); } }
fn get_animal(animal_type: &str) -> Box<dyn Animal> {
    if animal_type == "dog" {
        return Box::new(Dog {});
    } else {
        return Box::new(Cat {});
    }
}
fn main9() {
    get_animal("dog").cry();
    get_animal("cat").cry();
}
struct Counter {
    max: u32,
    count: u32,
}
impl Counter {
    fn new(max: u32) -> Counter {
        Counter { max: max, count: 0 }
    }
}
impl Iterator for Counter {
    type Item = u32;
    fn next(&mut self) -> Option<Self::Item> {
        self.count += 1;
        if self.count < self.max {
            Some(self.count)
        } else {
            None
        }
    }
}
fn main10() {
    let counter = Counter::new(10);
    for c in counter {
        println!("{}", c);
    }
}
use std::thread;
use std::time::Duration;
fn main11() {
    let th = thread::spawn(|| {
        for _i in 1..10 {
            println!("A");
            thread::sleep(Duration::from_millis(100));
        }
    });
    th.join().unwrap();
    println!("Finished");
}
fn main12() {
    let str = String::from("ABC");
    let th = thread::spawn(move || {
        for _i in 1..10 {
            println!("{}", str);
            thread::sleep(Duration::from_millis(100));
        }
    });
    th.join().unwrap();
    println!("Finished");
}
use futures::executor::block_on;
struct Song {
    lyric: String,
}
async fn learn_and_sing() {
    let song = learn_song().await;
    sing_song(song).await;
}
async fn learn_song() -> Song {
    let song = Song { lyric: String::from("La la la...") };
    println!("Learned song");
    return song;
}
async fn sing_song(song: Song) {
    println!("{}", song.lyric);
}
async fn dance() {
    println!("Dance");
}
async fn async_main() {
    let f1 = learn_and_sing();
    let f2 = dance();
    futures::join!(f1, f2);
}
fn main13() {
    block_on(async_main());
}
use rand::Rng;
fn main14() {
    let mut rng = rand::thread_rng();
    for _i in 1..10 {
        println!("{}", rng.gen_range(1, 101));
    }
}
let a = 123;
let p = &a;
println!("{}", *p);
let a = 123;
let ref p = a;
println!("{}", *p);
let mut a = 123;
let p = &mut a;
*p = 456;
println!("{}", a);
fn func1() {
    let name = String::from("ABC");
    println!("{}", name);
}
fn func2() {
    let name = String::from("ABC");
    println!("{}", name);
    func3(name);
    println!("{}", name);
}
fn func3(name: String) {
    println!("{}", name);
}
type Meter = u32;
type Millimeter = u32;
let m: Meter = 12;
let mm: Millimeter = 12000;
println!("{} {}", m, mm);
fn main15() {
    let x = 123;
    println!("{}", type_of(x));
}
fn type_of<T>(_: T) -> &'static str {
    std::any::type_name::<T>()
}
extern "C" {
    fn abs(x: i32) -> i32;
}
fn main16() {
    unsafe {
        println!("{}", abs(-123));
    }
}
static mut COUNTER: u32 = 0;
fn main17() {
    unsafe {
        println!("{}", COUNTER);
        COUNTER += 1;
        println!("{}", COUNTER);
    }
}
use std::sync::atomic::{self, AtomicU32, Ordering};
static COUNTER: AtomicU32 = AtomicU32::new(0);
fn count_up() { COUNTER.fetch_add(1, atomic::Ordering::SeqCst); }
fn get_count() -> u32 { return COUNTER.load(Ordering::SeqCst); }
fn main18() {
    println!("{}", get_count());
    count_up();
    println!("{}", get_count());
}
