package main
import (
    "os"
    "fmt"
)
func main() {
    fmt.Println("hello, world")
}
num := 123
str := "ABC"
fmt.Print("num=", num, " str=", str, "\n")
fmt.Println("num =", num, "str =", str)
fmt.Printf("num=%d str=%s\n", num, str)
var (
    a1 int = 123
    a2 int = 456
)
name, age = "Yamada", 26
const (
    foo = 100
    baa = 200
)
num = 123; str = "ABC";
type (
    UtcTime string
    JstTime string
)
var t1 UtcTime = "00:00:00"
var t2 JstTime = "09:00:00"
var b1 uint16 = 1234
var b2 uint32 = uint32(b1)
c1 := [3]string{}
c1[0] = "Red"
c1[1] = "Green"
c1[2] = "Blue"
fmt.Println(c1[0], c1[1], c1[2])
d1 := []string{}
d1 = append(d1, "Red")
d1 = append(d1, "Green")
d1 = append(d1, "Blue")
fmt.Println(d1[0], d1[1], d1[2])
e := []int{}
for i := 0; i < 10; i++ {
    e = append(e, i)
    fmt.Println(len(e), cap(e))
}
bufa := make([]byte, 0, 1024)
f1 := map[string]int{
    "x": 100,
    "y": 200,
}
fmt.Println(f1["x"])
f1["z"] = 300
delete(f1, "z")
fmt.Println(len(f1))
_, ok := f1["z"]
if ok {
    fmt.Println("Exist")
} else {
    fmt.Println("Not exist")
}
for key, value := range f1 {
    fmt.Printf("%s=%d\n", key, value)
}
if x > y {
    fmt.Println("x is greater then y")
}
if v > w {
    fmt.Println("Big")
} else if v < w {
    fmt.Println("Small")
} else {
    fmt.Println("Equal")
}
switch mode {
case "running":
    fmt.Println("Running")
case "stop":
    fmt.Println("Stopping")
default:
    fmt.Println("Unknown")
}
switch {
case s > t:
    fmt.Println("Big")
case s < t:
    fmt.Println("Small")
default:
    fmt.Println("Equal")
}
switch dayOfWeek {
case "sat":
    fallthrough
case "sun":
    fmt.Println("Horiday")
default:
    fmt.Println("Weekday")
}
for j := 0; j < 10; j++ {
    fmt.Println(i)
}
n := 0
for {
    n++
    if n > 10 {
        break
    } else if n % 2 == 1 {
        continue
    } else {
        fmt.Println(n)
    }
}
colors := [...]string{"Red", "Green", "Blue"}
for i, color := range colors {
    fmt.Printf("%d: %s\n", i, color)
}
package main
import (
    "fmt"
    "errors"
)
func main() {
    funcA()
}
func funcA() (string, error) {
    var err error
    filename := ""
    data := ""
    filename, err = GetFileName()
    if err != nil {
        fmt.Println(err)
        goto Done
    }
    data, err = ReadFile(filename)
    if err != nil {
        fmt.Println(err)
        goto Done
    }
    fmt.Println(data)
Done:
    return data, err
}
func GetFileName() (string, error) {
    return "sample.txt", nil
}
func ReadFile(filename string) (string, error) {
    return "Hello world!", errors.New("Can't read file")
}
func add(x int, y int) int {
    return x + y
}
func main() {
    fmt.Println(add(5, 3))
}
func addMinus(x int, y int) (int, int) {
    return x + y, x - y
}
func main() {
    add, min := addMinus(8, 5)
    fmt.Println(add, min)
}
func funcA(a int, b ... int) {
    fmt.Printf("a=%d\n", a)
    for i, num := range b {
        fmt.Printf("b[%d]=%d\n", i, num)
    }
}
func main() {
    funcA(1, 2, 3, 4, 5)
}
type Person struct {
    name string
    age int
}
func (p *Person) SetPerson(name string, age int) {
    p.name = name
    p.age = age
}
func (p *Person) GetPerson() (string, int) {
    return p.name, p.age
}
func main() {
    var p1 Person
    p1.SetPerson("Yamada", 26)
    name, age := p1.GetPerson()
    fmt.Printf("%s(%d)\n", name, age)
}
type Person struct {
    Name string
    Age int
    status int
}
a1 := Person{"Yamada", 26}
a2 := Person{name: "Tanaka", age: 32}
type Person struct {
    name string
}
func (p Person) ToString() string {
    return p.name
}
func (p Person) PrintOut() {
    fmt.Println(p.ToString())
}

type Book struct {
    title string
}
func (b Book) ToString() string {
    return b.title
}
func (b Book) PrintOut() {
    fmt.Println(b.ToString())
}
func main() {
    a1 := Person {name: "Taro Yamada"}
    a2 := Book {title: "I am a cat."}
    a1.PrintOut()
    a2.PrintOut()
}
func funcA(a interface{}) {
    fmt.Printf("%d\n", a.(int))
}
func PrintOut(a interface{}) {
    q, ok := a.(Printable)
    if ok {
        fmt.Println(q.ToString())
    } else {
        fmt.Println("Not printable.")
    }
}
func funcA(a interface{}) {
    switch a.(type) {
    case bool:
        fmt.Printf("%t\n", a)
    case int:
        fmt.Printf("%d\n", a)
    case string:
        fmt.Printf("%s\n", a)
    }
}
p1 := map[string]interface{} {
    "name": "Yamada",
    "age": 26,
}
type any interface{}
type dict map[string]any
p1 := dict {
    "name": "Yamada",
    "age": 26,
    "address": dict {
        "zip": "123-4567",
        "tel": "012-3456-7890",
    },
}
name := p1["name"]
tel := p1["address"].(dict)["tel"]
var a1 int
var p1 *int;
p1 = &a1
*p1 = 123
fmt.Println(a1)
func main() {
    var a1 int = 123
    var a2 int = 123
    fn(a1, &a2)
    fmt.Println(a1, a2)
}
func fn(b1 int, b2 *int) {
    b1 = 456
    *b2 = 456
}
a1 := Person{"Tanaka", 26}
p1 := &a1
fmt.Println(a1.name)
fmt.Println((*p1).name)
fmt.Println(p1.name)
type Book struct {
    title string
}
func main() {
    bookList := []*Book{}
    for i := 0; i < 10; i++ {
        book := new(Book)
        book.title = fmt.Sprintf("Title#%d", i)
        bookList = append(bookList, book)
    }
    for _, book := range bookList {
        fmt.Println(book.title)
    }
}
func funcA(chA chan <- string) {
    time.Sleep(1 * time.Second)
    chA <- "funcA Finished"
}
func funcB(chB chan <- string) {
    time.Sleep(2 * time.Second)
    chB <- "funcB Finished"
}
func main() {
    chA := make(chan string)
    chB := make(chan string)
    defer close(chA)
    defer close(chB)
    finflagA := false
    finflagB := false
    go funcA(chA)
    go funcB(chB)
    for {
        select {
        case msg := <- chA:
            finflagA = true
            fmt.Println(msg)
        case msg := <- chB:
            finflagB = true
            fmt.Println(msg)
        }
        if finflagA && finflagB {
            break
        }
    }
}
