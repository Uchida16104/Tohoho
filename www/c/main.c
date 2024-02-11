#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdarg.h>
#include <pthread.h>
#include <threads.h>
#include <stdbool.h>
#include <complex.h>
#include <stdatomic.h>
main1() {
    printf("hello, world!\n");
}
char *name = "Yamada";
int age = 32;
printf("My name is %s. I'm %d years old.\n", name, age);
int n = 123;
float x = 12.3;
char *s = "ABC";
printf("%5d", n);
printf("%-5d", n);
printf("%05d", n);
printf("%5.2f", x);
printf("%5s", s);
printf("%-5s", s);
main2() {
    int int_num = 123;
    long long_num;
    long_num = int_num;
    printf("%ld\n", long_num);
}
main3() {
    int k = 123;
}
int a1 = 123;
main4() {
    int a2 = 123;
}
const float pi = 3.14;
main5() {
    int i;
    for (i = 0; i < 10; i++) {
        count();
    }
}
count() {
    static n = 0;
    n++;
    printf("%d\n", n);
}
register int s = 0;
main6() {
    auto int t;
    int u;
}
main7() {
    int v[3];
    v[0] = 123;
    v[1] = 456;
    v[2] = 789;
    printf("%d %d %d\n", v[1],v[2], v[3]);
}
main8() {
    int w1 = 123;
    int *w2 = &w1;
    printf("%d\n", *w2);
    *w2 = 321;
    printf("%d\n", w1);
}
void func(int *);
static int a2;
void main9() {
    int a6;
    func(&a6);
}
void func(int *a6) {
    char *a1 = "ABC";
    static int a3;
    char *a4 = malloc(4);
    int a5;
    printf("f1 = %08x\n", func);
    printf("f2 = %08x\n", main);
    printf("a1 = %08x\n", a1);
    printf("a2 = %08x\n", &a2);
    printf("a3 = %08x\n", &a3);
    printf("a4 = %08x\n", a4);
    printf("a5 = %08x\n", &a5);
    printf("a6 = %08x\n", a6);
}
main10() {
    char x[4];
    x[0] = 'A';
    x[1] = 'B';
    x[2] = 'C';
    x[3] = 0;
    printf("%s\n", x);
}
main11() {
    char *y = "ABC";
    printf("%s\n", y);
}
void main12() {
    char str[10];
    int len;
    strcpy(str, "ABC");
    strcat(str, "DEF");
    len = strlen(str);
    printf("len=%d, str=%s\n", len, str);
}
strcpy_s(str, sizeof(str), "ABC");
strcat_s(str, sizeof(str), "DEF");
strncpy(str, "ABC", strlen(ABC));
strncat(str, "ABC", strlen(ABC));
char *create_string(char *s1) {
    char *s = (char *)malloc(strlen(s1) + 1);
    strcpy(s, s1);
    return s;
}
char *concat_string(char *s1, char *s2) {
    char *s = (char *)malloc(strlen(s1) + strlen(s2) + 1);
    strcpy(s, s1);
    strcat(s, s2);
    return s;
}
void main13() {
    char *s1 = create_string("Hello ");
    char *s2 = create_string("world!");
    char *s3 = concat_string(s1, s2);
    printf("%s\n", s1);
    printf("%s\n", s2);
    printf("%s\n", s3);
    free(s1);
    free(s2);
    free(s3);
}
if (z > 10) {
    printf("Big!\n");
} else if (z == 10) {
    printf("Equal!\n");
} else {
    printf("Small!\n");
}
int a = 0;
while (a < 10) {
    printf("%d\n", a);
    a++
}
int b = 0;
do {
    printf("%d\n", b);
    b++;
} while (b< 10);
int c;
for (c = 0; c < 10; c++) {
    printf("%d\n", c);
}
for (d = 0; d < 10; d++) {
    if (d == 3) {
        continue;
    }
    if (d == 5) {
        break;
    }
    printf("%d\n", d);
}
main14() {
    int e;
    for (e = 0; e < 10; e++) {
        if (e == 5) {
            goto done;
        }
    }
done:
    printf("e=%d\n", e);
}
int f = 2;
switch (f) {
case 1:
    printf("One\n");
    break;
case 2:
    printf("Two\n");
    break;
default:
    printf("More\n");
    break;
}
#define MY_MESSAGE "Hello world!"
#define print(x) printf("%s\n", x)
main15() {
    print(MY_MESSAGE);
}
#undef MY_MESSAGE
#undef print
#define SWAP(a, b) do { int tmp = a; a = b; b = tmp; } while(0)
main16() {
#ifdef CENTOS
    printf("CentOS\n");
#elif UBUNTU
    printf("Ubuntu\n");
#else
    printf("Unknown\n");
#endif
}
main17() {
    int ans;
    ans = add(3, 5);
    printf("%d\n", ans);
}
int add(int x, int y) {
    int z;
    z = x + y;
    return z;
}
void print(int num, ...) {
    va_list ap;
    va_start(ap, num);
    for (int i = 0; i < num; i++) {
        printf("%s\n", va_arg(ap, char *));
    }
    va_end(ap);
}
void main18() {
    print(3, "AAA", "BBB", "CCC");
}
void add(int x, int y, int *ans) {
    *ans = x + y;
}

void main19() {
    int x = 3;
    int y = 5;
    int z;
    add(x, y, &z);
    printf("z=%d\n", z);
}
void *thread_func(void *arg) {
    for (int i = 0; i < 10; i++) {
        printf("%s\n", (char *)arg);
    }
}
void main20() {
    pthread_t th1;
    pthread_create(&th1, NULL, thread_func, "ThreadA");
    pthread_join(th1, NULL);
}
int thread_func(void *arg) {
    for (int i = 0; i < 10; i++) {
        printf("%s\n", (char *)arg);
    }
}
void main21() {
    thrd_t th1;
    thrd_create(&th1, thread_func, "ThreadA");
    thrd_join(th1, NULL);
}
struct point {
    int x;
    int y;
}
main22() {
    struct point p1;
    p1.x = 200;
    p1.y = 300;
    printf("%d, %d\n", p1.x, p1.y);
}
union any_value {
    char c;
    int n;
    float f;
};
main23() {
    union any_value a1, a2, a3;
    a1.c = 'A';
    a2.n = 123;
    a3.f = 12.3;
    printf("%c, %d, %f\n", a1.c, a2.n, a3.f);
}
enum color {
    color_red,
    color_green,
    color_blue
};
main24() {
    enum color c = color_blue;
    printf("%d\n", c);
}
struct point { int x; int y; };
main25() {
    int n = 123;
    struct point p;
    printf("%d\n", sizeof(int));
    printf("%d\n", sizeof(123));
    printf("%d\n", sizeof(n));
    printf("%d\n", sizeof(p));
}
int g_value = 123;
g_hello(char *msg) {
    printf("Hello %s!\n", msg);
}
extern int g_value;
extern void g_hello(char *);
main26() {
    printf("%d\n", g_value);
    g_hello("Yamada");
}
typeof(int) a;
typeof(a) b;
typeof(123) c;
#define SWAP(a, b) do { typeof(a) tmp = a; a = b; b = tmp; } while (0)
volatile int stop_flag = 0;
func() {
    while (!stop_flag) {
        printf(".");
    }
}
main27() {
    printf("%s(%d): %s\n", __FILE__, __LINE__, __func__);
}
main28() {
    _Bool flag = true;
    printf("flag = %d\n", flag);
}
main29() {
    double _Complex a = 1.2 + 3.4i;
    printf("%f%+fi\n", creal(a), cimag(a));
}
inline int add(int x, int y) {
    return x + y;
}
main30() {
    printf("%d\n", add(3, 5));
}
main31() {
    printf("%d\n", _Alignof(short));
    printf("%d\n", _Alignof(long));
}
struct data {
    char a;
    _Alignas(4) char b;
};
_Atomic int total_count = ATOMIC_VAR_INIT(0);
void countup() {
    total_count++;
}
void print_int(int x) { printf("%d\n", x); }
void print_double(double x) { printf("%f\n", x); }
void print_string(char *x) { printf("%s\n", x); }
#define print(x) _Generic((x), \
    int:    print_int, \
    double: print_double, \
    char *: print_string \
)(x)
void main32() {
    print(123);
    print(1.23);
    print("ABC");
}
_Noreturn void myexit() {
    exit(0);
}
main33() {
    myexit();
}
int fx(int x) {
    _Static_assert(sizeof(x) == 8, "Size of x is not 8");
    return x;
}
main34() {
    fx(123);
}
void *thread_func(void *param) {
    static int a1 = 0;
    static _Thread_local int a2 = 0;
    for (int i = 0; i < 10; i++) {
        printf("%d %d\n", a1++, a2++);
    }
}
void main35() {
    pthread_t th1, th2;
    pthread_create(&th1, NULL, thread_func, "ThreadA");
    pthread_create(&th2, NULL, thread_func, "ThreadB");
    pthread_join(th1, NULL);
    pthread_join(th2, NULL);
}
