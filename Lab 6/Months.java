package srinivas;

import java.util.Scanner;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Choose a number from 1 to 12");
		int mon=obj.nextInt();
		if(mon==1)
		{
			System.out.println("January");
		}
		if(mon==2)
		{
			System.out.println("Febraury");
		}
		else if(mon==3)
		{
			System.out.println("March");
		}
		else if(mon==4)
		{
			System.out.println("April");
		}
		else if(mon==5)
		{
			System.out.println("May");
		}
		else if(mon==6)
		{
			System.out.println("June");
		}
		else if(mon==7)
		{
			System.out.println("July");
		}
		else if(mon==8)
		{
			System.out.println("August");
		}
		else if(mon==9)
		{
			System.out.println("September");
		}
		else if(mon==10)
		{
			System.out.println("October");
		}
		else if(mon==11)
		{
			System.out.println("November");
		}
		else if(mon==12)
		{
			System.out.println("December");
		}
		else
		{
			System.out.println("choose correct option");
		}		
	}

}
