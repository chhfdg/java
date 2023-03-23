import java.util.*;
class sum
{
    public static void main(String args[])
    {
    int n;
    int sum=0;
    System.out.print("enter n:");
    Scanner sc=new Scanner(System.in);
    try
    {
    n=sc.nextInt();
    int a[]={1,2,3,4,5};
    for(int i=0;i<n;i++)
    sum+=a[i];
    System.out.print("sum of elements:"+sum);
    }
    catch(Exception e)
    {
    System.out.print("array out of index was araised");
    }
    }


}