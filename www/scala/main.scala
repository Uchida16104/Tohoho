object hello {
  def main(args: Array[String]) {
    println("Hello world!")
  }
}
val b1: Boolean = true
val b2: Boolean = false
val c1: Char = 'a'
val c2: Char = 'あ'
val s1: String = "ABCDEFG"
val name = "Yamada"
println(s"His name is $name. ${name} is ${12 + 14} years old.")
val num = 123
println(f"${num}%05d")
println("ABC\nDEF")
println(raw"ABC\nDEF")
println("""ABC\nDEF""")
println("""This is Japan.
That is America.""")
println("""This is Japan.|That is America.""".stripMargin)
val a1: Byte = 127
val a2: Short = 32767
val a3: Int = 2147483647
val a4: Long = 9223372036854775807L
val b3: BigInt = BigInt(9223372036854775807L)
val b4: BigInt = b1 + b1
println(b2)
val a5: Float = 1.2f
val a6: Double = 1.2e3
val a7: BigDecimal = BigDecimal(1.2e99)
val s2: Symbol = 'ABC
val s3: Symbol = Symbol("ABC")
val v1: Any = 123
val v2: Any = "ABC"
var n1: AnyVal = 123
var n2: AnyVal = 12.3
var s: AnyRef = "ABC"
object main {
  def main(args: Array[String]) {
    val map = Map(1->"ABC", 2->123, 3->null)
    println(map.get(1))
    println(map.get(2))
    println(map.get(3))
    println(map.get(4))
  }
}
o = map.get(1)
o.get
o.getOrElse(-1)
o.orNull
var arr: Array[String] = Array.empty
arr = Array("A", "B", "C")
arr = arr :+ "D"
arr = "@" +: arr
println(arr.length)
println(arr(0))
arr(0) = "$"
for (a <- arr) println(a)
arr.foreach(a => print(a))
arr.map(n => n + n)
var arr2 = Array.ofDim[Int](2, 3)
arr2(1)(2) = 10002
var list = Nil
list = List[Int](1, 2, 3)
println(list(0))
list = 0 :: list
list = list ++ List(4, 5)
list = list ::: List(6, 7)
println(list.length)
for (n <- list) println(n)
list.foreach(n => println(n))
var list2 = list.map(n => n * 2)
var map = Map(1->"Red", 2->"Green", 3->"Blue")
println(map(2))
println(map.get(2))
var set = Set("Red", "Green", "Blue")
set = set + "Yellow"
set = set + "Red"
set = set - "Red"
import scala.collection.mutable.ListBuffer
    var lb = ListBuffer[Int](1, 2, 3)
    println(lb(0))
    lb(0) = 1
    lb += 4
    0 +=: lb
    lb.update(1, 999)
    println(lb)
    lb.remove(2)
    println(lb)
    for (n <- lb) print(n); println("")
    lb.foreach(n => println(n))
    var lb2 = lb.map(n => n * 2)
    println(lb2)
class Foo {
  def getErrorInfo(): (Int, String) = (404, "Not Found")
}
object main {
  def main(args: Array[String]) {
    var foo = new Foo()
    var (err, msg) = foo.getErrorInfo()
    println(err + " : " + msg)
  }
}
type Int16 = Short
type Int32 = Int
type Int64 = Long
var n: Int = 123
n.isInstanceOf[Int]
n.isInstanceOf[Any]
var n1: Short = 123
var n2: Int = n1.asInstanceOf[Int]
class Year(year: Int) {
  def add(n: Int): Int = this.year + n
  def +(n: Int): Int = this.year + n
}
object main {
  def main(args: Array[String]) {
    var y = new Year(2000)
    println(y.add(24))
    println(y add 24)
    println(y.+(24))
    println(y + 24)
  }
}
val a = 123
val b: Int = 123
var c = 123
var d: Int = 123
var x = 123
if (x == 123)
  println("OK")
else
  println("NG")
var n = 5
while (n < 0) {
  println(n)
  n = n - 1
}
var n = 0
do {
  println(n)
  n += 1
} while (n < 5)
for (i <- 1 to 10) println(i)
for (i <- 1 until 10) println(i)
for (i <- 0 to 10 by 2) println(i)
for (i <- 10 to 1 by -1) println(i)
for (s <- Array("A", "B", "C")) println(s)
for (i <- 1 to 10 if i % 2 == 0) println(i)
for (i <- 1 to 10 if i % 2 == 0; if i % 3 == 0) println(i)
val list = Array("A", "B", "C")
val list2 = for (s <- list) yield s + s
for (s <- list2) println(s)
for (i <- 1 to 2; j <- 1 to 3) println(i * 100 + j)
object main {
  def main(args: Array[String]) {
    val msg = 2 match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case _ => "More"
    }
    println(msg)
  }
}
val msg = 2 match {
  case 1 | 2 => "Small"
  case _ => "Big"
}
var msg = 2 match {
  case n if n < 5  => "Small"
  case n if n == 5 => "Equal"
  case n if n > 5  => "Big"
}
def getValue(value: Any) = {
  value match {
    case n: Int    => "Int: " + n
    case s: String => "String: " + s
    case _         => "Unknown"
  }
}
try {
  throw new IllegalArgumentException("arg1")
} catch {
  case e: IllegalArgumentException => println("IllegalArgumentException")
  case e: Exception => println("Unknown Exception")
} finally {
  println("Finally")
}
val add = (x: Int, y: Int) => x + y
def add(x: Int, y: Int): Int = x + y
def addA(x: Int, y: Int): Int = {
  x + y
}
def addB(x: Int, y: Int): Int = {
  return x + y
}
def func(msg: Int): Unit = println(msg)
object main {
  def func(name: String = "(unknown)", age: Int = -1): Unit = {
    println(name + "(" + age + ")")
  }
  def main(args: Array[String]) {
    func("Yamada", 26)
    func("Yamada")
    func(age = 26)
  }
}
object main {
  def hello(): Unit = println("Hello")
  def doFunc(n: Int, fn: () => Unit): Unit = {
    for (i <- 1 to n) fn()
  }
  def main(args: Array[String]) {
    doFunc(5, hello)
  }
}
def loop(n: Int)(stmt: => Unit): Unit = {
  if (n > 0) {
    stmt
    loop(n - 1) { stmt }
  }
}
loop(5) {
  println("A")
}
class Person
var p = new Person
class Person(name: String, age: Int = -1)
var p1 = new Person("Yamada", 26)
var p2 = new Person("Tanaka")
class Person(name: String, age: Int) {
  def getName(): String = this.name
  def getAge(): Int = this.age
}
var p = new Person("Yamada", 26)
println(p.getName())
println(p.getAge())
class Person(var name: String, var age: Int)
var p = new Person("Yamada", 26)
p.name = "Tanaka"
println(p.name)
class Person {
  private var _name = "(unknown)"
  private var _age = -1
  def name = _name
  def name_= (newName: String): Unit = _name = newName
  def age = _age
  def age_= (newAge: Int): Unit = _age = newAge
}
object main {
  def main(args: Array[String]) {
    val p = new Person
    p.name = "Yamada"
    p.age = 26
    println(p.name)
    println(p.age)
  }
}
class ClassA {
  def foo(): Unit = println("ClassA")
}

class ClassB extends ClassA {
  def baa(): Unit = println("ClassB")
}
object main {
  def main(args: Array[String]) {
    val obj = new ClassB()
    obj.foo()
    obj.baa()
  }
}
class ClassB extends ClassA {
  override def foo(): Unit = println("ClassA!!!")
}
final class ClassA {
  def hello() = println("Hello")
}
class ClassB {
  final def hello() = println("Hello")
}
sealed class ClassA {
  def hello() = println("Hello")
}
class ClassB extends ClassA {
  override def action() {
    super.action()
    println("ClassB:action")
  }
}
class ClassC extends ClassA with TraitB {
  override def action() {
    super[TraitB].action()
    super[ClassA].action()
    super.action()
    println("ClassB:action")
  }
}
class ClassA {
  def publicFunc() { println("publicFunc") }
  protected def protectedFunc() { println("protectedFunc") }
  private def privateFunc() { println("privateFunc") }
  def funcA() {
    this.publicFunc()
    this.protectedFunc()
    this.privateFunc()
  }
}
class ClassB extends ClassA {
  def funcB() {
    this.publicFunc()
    this.protectedFunc()
  }
}
class ClassC {
  def funcC() {
    var a = new ClassA()
    a.publicFunc()
  }
}
package packageA {
  class ClassA {
    protected[packageA] def protectedXFunc() { println("protectedXFunc") }
    private[packageA] def privateXFunc() { println("privateXFunc") }
  }
  class ClassB {
    def funcB() {
      var d = new ClassA()
      d.protectedXFunc()
      d.privateXFunc()
    }
  }
  package packageC {
    class ClassC {
      def funcC() {
        var d = new ClassA()
        d.protectedXFunc()
      }
    }
  }
}
abstract class Foo {
  def hello(): Unit
}
class Baa extends Foo {
  def hello(): Unit = println("Hello")
}
object main {
  def main(args: Array[String]) {
    var obj = new Baa()
    obj.hello()
  }
}
class Data[A](var value: A) {
  def print(): Unit = println(value)
}
object main {
  def main(args: Array[String]) {
    var d1 = new Data[Int](123)
    var d2 = new Data[String]("ABC")
    d1.print()
    d2.print()
  }
}
case class Point(x: Int, y: Int)
val p1 = Point(100, 200)
val p2 = Point(100, 200)
println(if (p1 == p2) "Equal" else "Not equal")
object Counter {
  private var counter = 0
  def countUp(): Unit = { counter += 1 }
  def getCount(): Int = counter
}
val cnt = Counter
cnt.countUp()
println(cnt.getCount())
class Math
object Math {
  val Pi = 3.14f
}
println(Math.Pi)
val u1 = Person.apply("Yamada")
val u2 = Person("Yamada)
class Person(name: String)
object Person {
  def apply(name: String): Person = new Person(name)
}
object main {
  def main(args: Array[String]) {
    var p = Person("Yamada")
  }
}
class Person(val name: String)
object Person {
  def apply(name: String): Person = new Person(name)
  def getName(p: Person): Option[String] = if (p.name != "Unknown") Some(p.name) else None
}
object main {
  def main(args: Array[String]) {
    var p = Person("Yamada")
    var name = Person.getName(p) match {
      case Some(n) => n
      case _ => "(Unknown)"
    }
    println(name)
  }
}
class Person(val name: String)
object Person {
  def apply(name: String): Person = new Person(name)
  def unapply(p: Person): Option[String] = if (p.name != "Unknown") Some(p.name) else None
}
object main {
  def main(args: Array[String]) {
    var p = Person("Yamada")
    var name = p match {
      case Person(n) => n
      case _ => "(Unknown)"
    }
    println(name)
  }
}
var name = p match {
  case Person(n) => n
  case Dog(n) => n
  case Cat(n) => n
  case _ => "(Unknown)"
}
trait Shape {
  def getArea(): Float
}
class Rect(width: Float, height: Float) extends Shape {
  override def getArea(): Float = width * height
}
class Circle(r: Float) extends Shape {
  override def getArea(): Float = r * r * 3.14f
}
object main {
  def main(args: Array[String]) {
    val r1 = new Rect(100, 200)
    val c1 = new Circle(100)
    println(r1.getArea())
    println(c1.getArea())
  }
}
trait Shape {
  def shape(): Unit = println("Shape!")
}
trait Foo { def foo(): Unit = println("Foo") }
trait Baa { def baa(): Unit = println("Baa") }
trait Baz { def baz(): Unit = println("Baz") }
class ClassA extends Foo with Baa with Baz
object main {
  def main(args: Array[String]) {
    val obj = new ClassA()
    obj.foo(); obj.baa(); obj.baz()
  }
}
import scala.language.implicitConversions
object main {
  implicit def intToBoolean(n: Int): Boolean = n != 0
  def main(args: Array[String]) {
    if (1) println("OK") else println("NG")
  }
}
import scala.language.implicitConversions
class MyString(val str: String) {
  def hello(): String = "Hello " + str
}
object main {
  implicit def stringToMyString(arg: String): MyString = new MyString(arg)
  def main(args: Array[String]) {
    println("Yamada".hello())
  }
}
import scala.language.implicitConversions
object main {
  implicit class MyString(val str: String) {
    def hello(): String = "Hello " + str
  }
  def main(args: Array[String]) {
    println("Yamada".hello())
  }
}
object main {
  def loadData(conn: Connection, dataId: Int): Data = { new Data }
  def saveData(conn: Connection, data: Data) = { println(data) }
  def main(args: Array[String]) {
    val conn = base.getConnection()
    var data = loadData(conn, 123)
    saveData(conn, data)
  }
}
object main {
  def loadData(dataId: Int)(implicit conn: Connection): Data = { new Data }
  def saveData(data: Data)(implicit conn: Connection) = { println(data) }

  def main(args: Array[String]) {
    implicit val conn = base.getConnection()
    var data = loadData(123)
    saveData(data)
  }
}
object main {
  def funcA(s: String) = { println("A"); "A" }
  def funcC(s: String) = { println("C"); "C" }
  def main(args: Array[String]) {
    lazy val a = funcA("")
    println("B")
    funcC(a)
    println("D")
  }
}
package users
class User {
  def print() = println("User")
}
def foo(v: AnyRef) = println(v)
foo("ABC": String)
class Foo[+T](v: T)
class Baa(v: Foo[AnyRef])
val e = new Baa(new Foo[String]("ABC"))
class Foo[-T](v: T)
class Baa(v: Foo[AnyRef])
val e = new Baa(new Foo[Any]("ABC"))
@deprecated("This method is deprecated", "2.10")
def hello() = println("Hello")
import scala.annotation.tailrec
@tailrec
def fact2(n: Int, s: Int = 1): Int = {
  if (n == 0) s else fact2(n - 1, s * n)
}
def fn(x: Option[String]) = (x: @unchecked) match {
  case Some(y) => y
  // case _ => ""
}
var add = (x:Int, y:Int, z:Int) => x + y + z
println(add(3, 4, 5))
val curriedAdd = add.curried
val curriedAdd2 = curriedAdd(3)
val curriedAdd3 = curriedAdd2(4)
println(curriedAdd3(5))
println(((curriedAdd(3))(4))(5))
println(curriedAdd(3)(4)(5))
var add = (x:Int, y:Int, z:Int) => x + y + z
println(add(3, 4, 5))
val partialAdd = add(_:Int, _:Int, 5)
println(partialAdd(3, 4))
val xml =
  <root>
    <items>
      <item><name>foo</name><price>120</price></item>
      <item><name>baa</name><price>320</price></item>
      <item><name>baz</name><price>640</price></item>
    </items>
  </root>
