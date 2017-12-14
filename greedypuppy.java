package stringmanipulation;
import java.util.*;
public class greedypuppy
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println("Enter the number of coin present in the box");
			int n=sc.nextInt();
			System.out.println("Enter the number of People Puppy will call");
			int k=sc.nextInt();
			int r=n%k;
			System.out.println("Maximum possible no of coins The Puppy gets is :"+r);
		}
		
	}
}
