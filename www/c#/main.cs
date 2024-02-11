using System;
using System.Collections.Generic;
using System.Threading;
using System.Threading.Tasks;
using MyPackages;
using System.Runtime.InteropServices;
class MainClass
{
    static void Main()
    {
        Console.WriteLine("Hello, World");
    }
}
int a1;
int a2 = 123;
var a3 = 123;
const int C4 = 123;
enum Color
{
    Red,
    Green,
    Blue
}
enum Color : ushort
{
    Red = 10,
    Green = 20,
    Blue = 30
}
int[] a = new int[3];
a[0] = 100;
a[1] = 200;
a[2] = 300;
class MyClass
{
    static void Main()
    {
        var list = new List<string>();
        list.Add("Red");
        list.Add("Green");
        list.Add("Blue");
        Console.WriteLine(list[2]);
    }
}
string str = null;
object obj = null;
int? num = null;
if (n > 100)
{
    Console.WriteLine("Big!");
}
else
{
    Console.WriteLine("Small");
}
for (int i = 0; i < 10; i++)
{
    Console.WriteLine(i);
}
foreach (string s in strings_list)
{
    Console.WriteLine(s);
}
while (n < 10)
{
    Console.WriteLine(n);
    n++;
}
do
{
    Console.WriteLine(n);
    n++;
} while (n < 10);
{
    if (n > 10)
    {
        break;
    }
}
{
    if (n < 5)
    {
        continue;
    }
}
switch (n)
{
    case 1:
        Console.WriteLine("One");
        break;
    case 2:
        Console.WriteLine("Two");
        break;
    default:
        Console.WriteLine("Many");
        break;
}
static IEnumerable<int> Range(int from, int to)
{
    for (int i = from; i < to; i++)
    {
        yield return i;
    }
    yield break;
}
unchecked
{
    int n = int.MaxValue;
    Console.WriteLine(n + 1);
}
checked
{
    int n = int.MaxValue;
    Console.WriteLine(n + 1);
}
static void MyThread(Counter counter)
{
    for (int i = 0; i < 100; i++)
    {
        lock (counter)
        {
            var count = counter.getCount();
            counter.setCount(count + 1);
        }
    }
}
struct Point
{
    public int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
Point p1 = new Point(100, 200);
class Person
{
    private string _name;
    public string Name
    {
        get { return _name; }
        set { _name = value; }
    }
}
class MyClass
{
    static void Main()
    {
        Person p1 = new Person();
        p1.Name = "Yamada";
        Console.WriteLine(p1.Name);
    }
}
class MyClass
{
    public int Add(int x, int y)
    {
        return x + y;
    }
}
class MainClass
{
    static void Main()
    {
        var p = new MyClass();
        var ans = p.Add(5, 3);
        Console.WriteLine(ans);
    }
}
class MyClass
{
    public static int Add(int x, int y)
    {
        return x + y;
    }
}
class MainClass
{
    static void Main()
    {
        var ans = MyClass.Add(5, 3);
        Console.WriteLine(ans);
    }
}
static void Func(params int[] list)
{
    for (int i = 0; i < list.Length; i++)
    {
        Console.WriteLine(list[i]);
    }
}
static void Main()
{
    Func(1, 2, 3, 4, 5);
}
class Cat : Animal
{
    public Cat() : base("cat")
    {
    }
}
Cat c1 = new Cat();
class Cat : Animal
{
    new public void Cry()
    {
        Console.WriteLine("miaow miaow");
    }
}
class Cat : Animal
{
    new public void Cry()
    {
        base.Cry();
    }
}
abstract class Animal
{
    public abstract void Cry();
}

class Cat : Animal
{
    public override void Cry()
    {
        Console.WriteLine("miaow miaow");
    }
}
interface Criable<T>
{
    void Cry();
}

class Cat : Criable<Cat>
{
    public void Cry()
    {
        Console.WriteLine("miaow miaow");
    }
}
class MyClass
{
    static void Main()
    {
        Cat c1 = new Cat();
        c1.Cry();
    }
}
class String
{
    string _str;

    public String(string str)
    {
        this._str = str;
    }
    public override string ToString()
    {
        return this._str;
    }
    public static String operator+ (String x, String y)
    {
        return new String(x._str + y._str);
    }
}
class MyClass
{
    static void Main()
    {
        String s1 = new String("ABC");
        String s2 = new String("XYZ");
        String s3 = s1 + s2;
        Console.WriteLine(s3.ToString());
    }
}
class SampleCollection<T>
{
    private T[] _arr = new T[100];

    public T this[int i]
    {
        get { return _arr[i]; }
        set { _arr[i] = value; }
    }
}
class MyClass
{
    static void Main()
    {
        SampleCollection<string> arr = new SampleCollection<string>();
        arr[0] = "Hello world!";
        Console.WriteLine(arr[0]);
    }
}
class Animal { public string Cry() { return "(unknown...)"; } }
class Cat : Animal { new public string Cry() { return "miaow miaow"; } }
class Book {}
class MainClass
{
    static void Main()
    {
        var c1 = new Cat();
        Console.WriteLine(c1.GetType() == typeof(Animal));
        Console.WriteLine(c1.GetType() == typeof(Cat));
        Console.WriteLine(c1.GetType() == typeof(Book));
        Console.WriteLine(c1 is Animal);
        Console.WriteLine(c1 is Cat);
        Console.WriteLine(c1 is Book);
        Console.WriteLine(c1.Cry());
        Console.WriteLine((c1 as Animal).Cry());
        Console.WriteLine(c1.Cry());
        Console.WriteLine(((Animal)c1).Cry());
    }
}
class Meter
{
    public int value;
    public Meter(int value)
    {
        this.value = value;
    }
    public static explicit operator Meter(MilliMeter mm)
    {
        return new Meter(mm.value / 1000);
    }
}
class MilliMeter
{
    public int value;
    public MilliMeter(int value)
    {
        this.value = value;
    }
    public static implicit operator MilliMeter(Meter m)
    {
        return new MilliMeter(m.value * 1000);
    }
}
class MyClass
{
    static void Main()
    {
        MilliMeter mm1 = new MilliMeter(12345);
        Console.WriteLine(mm1.value + "mm");
        Meter m1 = (Meter)mm1;
        Console.WriteLine(m1.value + "m");
        MilliMeter mm2 = m1;
        Console.WriteLine(mm2.value + "mm");
    }
}
delegate void SampleDelegate(int n);
class MainClass
{
    static void Main()
    {
        SampleDelegate func = MyFunc;
        func(123);
    }
    static void MyFunc(int n)
    {
        Console.WriteLine(n);
    }
}
public delegate void OnClickHandler(object sender, EventArgs e);
class MyButton
{
    public event OnClickHandler onclick;
    public void Click()
    {
        this.onclick(this, EventArgs.Empty);
    }
}
class MyClass
{
    static public void OnClick(object o, EventArgs e)
    {
        Console.WriteLine("Clicked!!");
    }
    static void Main(string[] args)
    {
        MyButton btn = new MyButton();
        btn.onclick += new OnClickHandler(MyClass.OnClick);
        btn.Click();
    }
}
class MyClass
{
    static void Main()
    {
        var threadA = new Thread(() => {
            for (int i = 0; i < 100; i++)
            {
                Console.Write("a");
                Thread.Sleep(100);
            }
        });
        var threadB = new Thread(() => {
            for (int i = 0; i < 100; i++)
            {
                Console.Write("b");
                Thread.Sleep(100);
            }
        });
        threadA.Start();
        threadB.Start();
        threadA.Join();
        threadB.Join();
    }
}
class MyClass
{
    static int CountUpTask()
    {
        int total = 0;
        for (int i = 0; i <= 100; i++) { total += i; Thread.Sleep(10); }
        return total;
    }
    static void Main()
    {
        var taskA = Task.Run(() => {
            return CountUpTask();
        });
        var taskB = Task.Run(() => {
            return CountUpTask();
        });
        Task.WhenAll(taskA, taskB);
        Console.WriteLine(taskA.Result);
        Console.WriteLine(taskB.Result);
    }
}
class MyClass
{
    static int CountUpTask(string name)
    {
        int total = 0;
        for (int i = 0; i <= 100; i++)
        {
            total += i;
            Thread.Sleep(10);
            Console.Write(name);
        }
        return total;
    }
    static async Task<int> CountUpAsync(string name)
    {
        int total = 0;
        for (int i = 0; i <= 100; i++)
        {
            total += i;
            await Task.Delay(10);
            Console.Write(name);
        }
        return total;
    }
    static async Task Main()
    {
        bool stop = false;
        var taskX = Task.Run(() => { while (!stop) { Console.Write("."); Thread.Sleep(10); } });
        var taskA = Task.Run(() => CountUpTask("A"));
        Task.WhenAll(taskA);
        var countA = taskA.Result;
        var countB = await CountUpAsync("B");
        var countC = CountUpTask("C");
        stop = true;
        Console.WriteLine("\n{0} {1} {2}", countA, countB, countC);
    }
}
class MyClass
{
    unsafe static void Main()
    {
        byte[] arr = {100, 200, 300};
        fixed (byte *p = arr)
        {
            Console.WriteLine(*(p + 0));
            Console.WriteLine(*(p + 1));
            Console.WriteLine(*(p + 2));
        }
    }
}
namespace MyPackages
{
    public class MyClass
    {
        public void MyMethod()
        {
            Console.WriteLine("Hello!!");
        }
    }
}
class Hello
{
    static void Main()
    {
        MyClass p = new MyClass();
        p.MyMethod();
    }
}
amespace MyProduct.System
{
    class MyClass
    {
        static void print(string msg)
        {
            global::System.Console.Write(msg);
        }
        static void Main()
        {
            print("Hello\n");
        }
    }
}
class MyClass
{
    [DllImport("User32.dll", CharSet=CharSet.Unicode)]
    public static extern int MessageBox(IntPtr h, string m, string c, int type);

    static int Main()
    {
        return MessageBox((IntPtr)0, "Hello!", "My Message Box", 0);
    }
}
extern alias GridV1;
extern alias GridV2;
string name = "Tanaka";
int age = 123;
Console.WriteLine(nameof(name));
Console.WriteLine(nameof(age));
List<int> Scores = new List<int>() { 97, 92, 81, 60 };
IEnumerable<int> queryHighScores =
    from score in Scores
    where score > 80
    select score;
foreach (int n in queryHighScores)
{
    Console.Write(n + " ");
}
static void Main()
{
    int num = 123;
    Func(num);
}
static void Func(ref int num)
{
    num = 999;
}
static void Main()
{
    int num = 123;
    Func(ref num);
    Console.WriteLine(num);
}
static void Func(out int num)
{
    num = 999;
}
static void Main()
{
    int num = 123;
    Func(out num);
    Console.WriteLine(num);
}
static int num = 123;
static ref int Func()
{
    return ref num;
}
static void Main()
{
    ref int num = ref Func();
    Console.WriteLine(num);
}
class Cat
{
    readonly string name;
    public Cat(string name)
    {
        this.name = name;
    }
}
readonly struct Point
{
    readonly int x, y;
    public Point(int x, int y)
    {
        (this.x, this.y) = (x, y);
    }
}
static int num = 123;
static ref readonly int Func2()
{
    return ref num;
}
var n1 = sizeof(int);
unsafe { var n2 = sizeof(int*); }
n3 = MySizeOf<Point>();
static unsafe int MySizeOf<T>() where T : unmanaged { return sizeof(T); }
static void HeapAlloc()
{
    int length = 1024;
    int[] numbers = new int[length];
    for (var i = 0; i < length; i++) { numbers[i] = i; }
}
static void StackAlloc()
{
    int length = 1024;
    Span<int> numbers = stackalloc int[length];
    for (var i = 0; i < length; i++) { numbers[i] = i; }
}
public volatile int counter = 0;
dynamic obj;
obj = new ClassA();
obj = new ClassB();
var err = 0;
try
{
    err = 300;
    throw new Exception();
}
catch  (Exception e) when (err == 300)
{
    Console.WriteLine("Error 300");
    Console.WriteLine(e);
}
catch  (Exception e) when (err == 400)
{
    Console.WriteLine("Error 400");
    Console.WriteLine(e);
}
string lang = "uk";
int floor = 1;
switch (floor)
{
    case 1 when lang == "us":
        Console.WriteLine("First floor");
        break;
    case 1 when lang == "uk":
        Console.WriteLine("Grand floor");
        break;
    case 2 when lang == "us":
        Console.WriteLine("Second floor");
        break;
    case 2 when lang == "uk":
        Console.WriteLine("First floor");
        break;
}
static int Max1(int x, int y)
{
    return x > y ? x : y;
}
static T Max2<T>(T x, T y) where T : IComparable
{
    return x.CompareTo(y) > 0 ? x : y;
}
struct Point
{
    public byte x, y;
    public Point(byte x, byte y) { (this.x, this.y) = (x, y); }
}
class MyClass
{
    unsafe static void MemSet0<T>(ref T x, byte c) where T : unmanaged
    {
        fixed (T* p = &x)
        {
            var b = (byte *)p;
            var size = sizeof(T);
            for (int i = 0; i < size; i++) { b[i] = c; }
        }
    }
    static void Main()
    {
        var p = new Point(10, 20);
        MemSet0<Point>(ref p, 30);
        Console.WriteLine("{0} {1}", p.x, p.y);
    }
}
