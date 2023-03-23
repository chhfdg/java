import java.util.Scanner;
 class a7 {
	public static void main(String args[])
	{
	int x,i,a,y=0,j,m=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N value: ");
	x=sc.nextInt();
	
	int []s=new int[x];
	System.out.println("Enter"+x+"elements-");
	for(i=0;i<x;i++)
	{
	s[i]=sc.nextInt();
	}
	
	for(i=0;i<x;i++)
	{
		a=s[i];
		for(j=1;j<11;j++)
		{
			System.out.println(a+" X "+j+" = "+a*j);
		}
	System.out.println("\n");
	}
	
	}
}