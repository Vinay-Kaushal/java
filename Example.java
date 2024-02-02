class Area
{
static void fun1()
{
System.out.println("Area 1");
}
static void fun2()
{
System.out.println("Area 2");
}
}
class Example
{
static void fun1()
{
System.out.println("a");
}
static void fun2()
{
System.out.println("b");
}
public static void main(String []args)
{
System.out.println("c");
Area.fun1();
Area.fun2();
}
}