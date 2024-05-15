package srinivas;

import java.util.Scanner;

public class Leap {
    static void lp(int n)
    {
    	if(n%4==0 || n%400==0)
    	{
    		System.out.println("n is a leap year");
    	}
    	else
    	{
    		System.out.println("n is not a leap year");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter n value\n");
		int n=obj.nextInt();
		lp(n);
	}

}
