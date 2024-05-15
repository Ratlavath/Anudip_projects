package srinivas;

import java.util.Scanner;

public class Palindrome {
	
	static void pal(int n)
	{
		int n1=n;
		int rem;
		int sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
	    if(sum==n1)
	    {
	    	System.out.println("n is palindrome");
	    }
	    else
	    {
	    	System.out.println("n is not palindrome");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter n value\n");
		int n=obj.nextInt();
		pal(n);
	}

}
