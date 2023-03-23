import java.io.*;
import java.util.*;
class tg<T>
{
T a;
T b;
tg(T a1,T b1)
{
a=a1;
b=b1;
}
void swap()
{
T c=a;
a=b;
b=c;
}
void print(){
System.out.println(a);
System.out.println(b);
}
}
class gdemo
{
public static void main(String args[])
{
tg<Integer>obj=new tg<Integer>(45,50);
System.out.println("Before swapping");
obj.print();
System.out.println("After swapping");
obj.swap();
obj.print();
tg<String>obj1=new tg<String>("SSE","VIT");
System.out.println("Before swapping");
obj1.print();
System.out.println("After swapping");
obj1.swap();
obj1.print();
}
}