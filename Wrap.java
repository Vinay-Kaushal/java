class Wrap
{
public static void main (String []args)
  {
   int x=Integer.parseInt("123");
   System.out.println(x);

   Integer i1=Integer.valueOf("2345");
   int y=i1.intValue();
   System.out.println(y);
  }
}