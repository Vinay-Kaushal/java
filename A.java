class B
{
 private int x;
 private int y;
 void f1()
{
x=2;
y=3;
}
void f2()
{
System.out.println(x);
System.out.println(y);
}
}
class A
{
public static void main(String []args)
{
B b1=new B();
  b1.f1();
  b1.f2();
}
}