package srinivas;

import java.util.Scanner;

public class evnOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=obj.nextInt();
		if(num%2==0)
		{
			System.out.println("Num is Even");
		}
		else{
			{
				System.out.println("Num is Odd");
			}
		}
	}

}
