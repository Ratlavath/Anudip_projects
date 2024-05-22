package srinivas;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter three numbers\n");
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		int num3=obj.nextInt();
		int res=(num1>num2) ? (num1>num3 ? num1 : num3) : (num2>num3 ? num2 : num3);
	    System.out.println("Maximum of three number "+num1+", "+num2+", "+num3+" is "+res);
	}

}
