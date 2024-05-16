package srinivas;

import java.util.Scanner;

public class Circlearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		//String input;
		do 
		{
		System.out.println("enter radius\n");
		int r=obj.nextInt();
		double area= 3.14*r*r;
		System.out.println("Radius:\n"+area);
		System.out.println("do you want to try again type Yes or yes\n");
		String in=obj.nextLine();
		}while(in=="Yes" || "yes");
	}

}
