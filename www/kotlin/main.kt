import kotlin.reflect.KProperty
import org.example.ExampleClass
import org.example.*
import org.example.ExampleClass as SampleClass
fun main1() {
    println("Hello, World!")
}
fun main2(args: Array<String>) {
    println(args.contentToString())
}
print("Hello\n")
println("Hello");
var a: Int = 1
var b = 2
var c: Int
c = 3
val MAX_COUNT: Int = 1024
val MAX_SIZE = 1024
const val FOO = "Foo"
var d: Boolean = true
var e: Byte = 123
var f: Short = 123
var g: Int = 123
var h: Long = 123L
var i: Float = 12.3F
var j: Double = 12.3
var k: Char = 'A'
var l: String = "ABC"
var b1: Boolean = true
var b2: Boolean = false
println("$a + $b = ${add(a, b)}")
println("""\ is a backslash""")
println("""This is Japan.
That is America.""")
fun foo(arg: Any?) {
    when (arg) {
        is Int -> println("Int: $arg")
        is Char -> println("Char: $arg")
        is String -> println("String: $arg")
    }
}
123.toString()
"123".toInt()
"3.14".toInt()
1.23.toInt()
1.23.roundToInt()
var nums = arrayOf(1, 2, 3)
var cols = arrayOf("Red", "Green", "Blue")
for (n in nums) { println(n) }
for (c in cols) { println(c) }
println(nums[0])
println(cols[1])
var nums = listOf(1, 2, 3)
var cols = listOf("Red", "Green", "Blue")
for (n in nums) { println(n) }
for (c in cols) { println(c) }
val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
println(nums.filter { it % 2 == 0 })
var s = mutableSetOf("Red", "Green", "Blue")
s.add("Red")
println(s)
var map = mapOf("Red" to "#f00", "Green" to "#0f0", "Blue" to "#00f")
println(map["Red"])
for ((key, value) in map) {
    println("$key = $value")
}
for (i in 1..10) println(i)
for (i in 1..10) println(i)
for (i in 1.rangeTo(10)) println(i)
if (n in 1..10) println("OK")
if (n !in 1..10) println("Out of range.")
for (i in 10 downTo 1 step 2) println(i)
if ('b' in 'a'..'z') println("OK")
if ("gz" in "aa".."zz") println("OK")
if (1.23 in 0.00..9.99) println("OK")
println("ABC" is String)
println("ABC" !is String)
open class ClassA() {}
class ClassB(): ClassA() {}
var a = ClassA()
var b = ClassB()
println(a is ClassA)
println(a is ClassB)
println(b is ClassA)
println(b is ClassB)
fun foo(a: Any) {
    when (a) {
        is String -> println("String")
        is Char -> println("Char")
        else -> println("Unknown")
    }
}
typealias Meter = Int
typealias Killometer = Int
var s: String = a as String
open class ClassA(val name: String) {}
class ClassB(name: String): ClassA(name) {}
var obj1: ClassA = ClassB("Yamada")
var obj2: ClassB = obj1 as ClassB
var n1: Short? = 123
var n2: Int? = n1 as? Int?
var a: dynamic
a = 123
a = "ABC"
if (a > b) {
    println("Big")
} else {
    println("Small")
}
var c = if (a > b) a else b
for (i in 1..10) {
    println(i)
}
for (i in 10 downTo 0 step 2) {
    println(i)
}
var colors = arrayOf("Red", "Green", "Blue")
for (color in colors) {
    println(color)
}
var a = arrayOf("Red", "Green", "Blue")
a.forEach {
    value -> println(value)
}
a.forEachIndexed {
    index, value -> println("${index}: ${value}")
}
var i = 10
while (i > 0) {
    println(i--)
}
var i = 10
do {
    println(i--)
} while (i > 0)
for (i in 1..5) {
    if (i == 2) {
        break
    }
    println(i)
}
for (i in 1..5) {
    if (i == 2) {
        continue
    }
    println(i)
}
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        in 2..3    -> "Two or Three"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
foo@ for (i in 1..5) {
    for (j in 1..5) {
        if (i == 3 && j == 3) break@foo
        println("$i $j")
    }
}
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach baa@ {
        if (it == 3) return@baa
        println(it)
    }
}
class A {
    val foo = "AAA"
    inner class B {
        val foo = "BBB"
        fun foo() = println("${this.foo} ${this@A.foo}")
    }
}
fun main3() {
    A().B().foo()
}
try {
    if () {
        throw IllegalStateException()
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Finally")
    }
}
fun sum1(a: Int, b: Int): Int {
    return a + b
}
fun sum2(a: Int, b: Int) = a + b
fun drawCircle(x: Int, y: Int, r: Int,
    lineColor: String = "#000",
    fillColor: String = "transparent",
    borderWidth: String = "1px") {}
fun main4() {
    drawCircle(100, 100, 50, borderWidth="2px")
}
fun printMessage(msg: String) {
    println(msg)
}
fun raiseError(msg: String): Nothing {
    throw MyException(msg)
}
fun foo(vararg args: String) {
    args.forEach {
        println(it)
    }
}
fun main5() {
    foo("A", "B", "C")
}
fun main6() {
    val arr = arrayOf("A", "B", "C")
    foo(*arr)
}
fun main7() {
    var add1 = fun(a: Int, b: Int): Int = a + b
    println(add1(3, 5))
}
fun main7() {
    var add2 = { a: Int, b: Int -> a + b }
    var add3: (Int, Int) -> Int = { a, b -> a + b }
    println(add2(3, 5))
    println(add3(3, 5))
}
var square: (Int)->Int = { it * it }
println(square(5))
inline fun foo() {
    println("Foo")
}
inline fun foo(n: Int, noinline lambda: (Int) -> Int) {
    println(lambda(n))
}
fun main8() {
    foo(3, { n -> n * 2 })
}
inline fun foo(n: Int, crossinline lambda: (Int) -> Int) {
    object: Runnable {
       override fun run() = println(lambda(n))
    }.run()
}
fun main9() {
    foo(3, { n -> n * 2 })
}
fun String.hello() = println("Hello $this")
fun main10() {
    "Yamada".hello()
}
infix fun Int.add(x: Int): Int {
    return this + x
}
fun main11() {
    println(3.add(5))
    println(3 add 5)
}
var a: String? = null
fun main12() {
    var a: String? = "ABC"
    var b: String? = "ABC"
    var c: String? = "ABC"
    var d: String? = "ABC"
    if (a != null) { println(a.length) }
    println(b?.length)
    println(c!!.length)
    d = d ?: "(Unknown)"
    println(d.length)
}
fun add(x: Int, y: Int): Int = x + y
fun main13() {
    val method = ::add
    println(method(3, 5))
}
class Person(var name: String, var age: Int) {
    fun print() {
        println("${this.name} ${this.age}")
    }
}
fun main14() {
    var p1 = Person("Yamada", 26)
    p1.print()
}
class Person1 constructor(_name: String) {
    var name = _name
}
var p1 = Person1("Yamada")
println(p1.name)
class Person2(_name: String) {
    var name = _name
}
class Person3(var name: String) {
}
class Person4 {
    var name: String
    var age: Int = -1
    constructor(_name: String) { name = _name }
    constructor(_name: String, _age: Int) { name = _name; age = _age }
}
class Person5(var name: String) {
    constructor(_name: String, _age: Int) : this(_name) {}
}
class Foo {
    init {
        println("Foo is created.")
    }
}
open class Animal() {}
class Cat : Animal() {}
final class Animal() {}
open class Foo {
    open fun print() { println("Foo") }
}
class Baa(): Foo() {
    override fun print() { println("Baa") }
}
open class Animal(var type: String)
class Cat: Animal {
    var name: String
    constructor(_name: String): super("Cat") {
        name = _name
    }
}
open class Animal(var type: String)
class Cat(var name: String): Animal("Cat") {}
class A {
    class B {}
}
var obj = A.B()
class A {
    inner class B {}
}
var obj = A().B()
class Foo() {
    var name: String = ""
        set(value) {
            println("---set---")
            field = value
        }
        get() {
            println("---get---")
            return field
        }
}
fun main15() {
    var a = Foo()
    a.name = "Yamada"
    println(a.name)
}
abstract class Foo {
    abstract var name: String
    abstract fun hello(): String
}
class Baa : Foo() {
    override var name: String = "..."
    override fun hello(): String = "Hello"
}
fun main16() {
    var b = Baa()
    println(b.name)
    println(b.hello())
}
interface Printable { fun print() }
interface Writable { fun write() }
class Animal(var type: String) : Printable, Writable {
    override fun print() = println("PRINT!!")
    override fun write() = println("WRITE!!")
}
package foo
public var a1: String = "A1"
internal val a2: String = "A2"
private var a3: String = "A3"
class Foo {
    public var a1: String = "A1"
    internal val a2: String = "A2"
    private var a3: String = "A3"
    protected val a4: String = "A4"
}
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
enum class Color(val rgb: String) {
    RED("#f00"),
    GREEN("#0f0"),
    BLUE("#00f"),
}
fun main17() {
    println(Direction.NORTH)
    println(Color.RED)
    println(Color.RED.name)
    println(Color.RED.rgb)
}
class Person(val name: String, var age: Int) {
    override fun toString() = "$name($age)"
}
fun main18() {
    println(Person("Yamada", 26))
}
class Foo(val name: String) {
    override fun equals(other: Any?) = this.name == (other as Foo).name
}
fun main19() {
    val a1 = Foo("Yamada")
    val a2 = Foo("Yamada")
    println(a1 == a2)
}
class Foo1(var name: String)
data class Foo2(var name: String)
fun main20() {
    var a1 = Foo1("Yamada")
    println(a1)
    var a2 = Foo2("Yamada")
    println(a2)
    var a3 = a2.copy()
    println(a3)
}
interface Base {
    fun funcA()
    fun funcB()
    fun funcC()
}
class BaseImpl(): Base {
    override fun funcA() { println("AAA") }
    override fun funcB() { println("BBB") }
    override fun funcC() { println("CCC") }
}
class BaseImplEx(b: Base): Base by b {
    override fun funcA() { println("AAA!!!") }
}
fun main21() {
    val obj = BaseImpl()
    obj.funcA()
    BaseImplEx(obj).funcA()
}
class Example {
    var p: String by Delegate()
    override fun toString() = "Example"
}
class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "-- Get ${prop.name} from $thisRef"
    }
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("-- Set \"$value\" to ${prop.name} in $thisRef")
    }
}
fun main22() {
    val e = Example()
    e.p = "NEW STRING"
    println(e.p)
}
window.addMouseListener(object : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent) { /*...*/ }
    override fun mouseEntered(e: MouseEvent) { /*...*/ }
})
object Config {
    var maxCount = 100
}
println(Config.maxCount)
object Foo {
    fun hello() = println("Hello!")
}
fun main23() {
    Foo.hello()
}
class Math {
    companion object {
        fun add(a: Int, b: Int) = a + b
    }
}
println(Math.add(3, 5))
class Foo(val value: Any)
fun main24() {
    val a1 = Foo(123)
    println(a1.value)
}
class Foo<T>(val value: T)
fun main() {
    val a1 = Foo(123)
    println(a1.value + 1)
}
class Foo<T: Number>(val value: T)
fun <T> foo(x: T): T {}
foo<Int>(123)
foo<String>("ABC")
foo(123)
foo("ABC")
fun <T: Number> foo(x: T): T {}
fun <T> foo(x: T) where T: Runnable, T: Cancellable {}
package org.example
fun exampleFunction() {}
class ExampleClass {}
data class Complex(var real: Double, var imag: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imag + other.imag)
    }
}
fun main25() {
    var c1 = Complex(1.0, 2.0)
    var c2 = Complex(3.0, 4.0)
    println(c1 + c2)
}
class Foo {
    lateinit var name: String
    fun init(name: String) { this.name = name }
}
fun connectToDB() {
    return db
}
fun main() {
    val db by lazy { connectToDB() }
}
expect class Foo {
    fun getPlatformName(): String
}
actual class Foo {
    fun getPlatformName(): String = "Android"
}
external fun foo() {}
fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}
inline fun <reified T> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}
