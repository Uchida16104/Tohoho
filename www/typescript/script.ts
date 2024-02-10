function hello(name: string): void {
    console.log("Hello " + name + "!");
}
let your_name: string = "Yamada";
hello(your_name);
let v_bool: boolean = true;
let v_num: number = 123;
let v_str: string = "ABCDEFG";
let v_null: null = null;
let v_undef: undefined = undefined;
let v_arr1: string[] = ["Red", "Green", "Blue"];
let v_arr2: Array<string> = ["Red", "Green", "Blue"];
let v_tuple: [string, number] = ["Yamada", 26];
let v_obj: object = {"name": "Yamada", "age": 26};
enum Color {Red, Green, Blue};
let v_enm: Color = Color.Green;
class MyClass { name: string; }
var val_class: MyClass = new MyClass();
let v_any: any = 4;
function log(msg: string): void {
    console.log(msg);
}
function error(msg: string): never {
    throw new Error(msg);
}
interface Person {
    name: string;
    age: number;
}
let foo = <Person>{}
foo.name = "Yamada";
let bar = {} as Person
bar.name = "Yamada";
type bool = boolean;
let flag: bool = true;
