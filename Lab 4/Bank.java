package srinivas;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("choose any one option from below\n1.Deposite\n2.Withdraw\n3.BalanceEnquiry");
		String in=obj.nextLine();
		String Deposite="Deposite";
		String Withdraw="Withdraw";
		String BalanceEnquiry="BalanceEnquiry";
		int bal=1000;
		if(in.equals(Deposite))
		{
			System.out.println("enter amount to deposite");
			int dp=obj.nextInt();
			int newbal=bal+dp;
			System.out.println("Balance:"+newbal);
		}
		else if(in.equals(Withdraw))
		{
			System.out.println("enter amount to withdraw");
			int wd=obj.nextInt();
			int newbal=bal-wd;
			System.out.println("Balance:"+newbal);
		}
		else if(in.equals(BalanceEnquiry))
		{
			System.out.println("Balance:"+bal);
		}
		else
		{
			System.out.println("Choose correct option");
		}
	}

}
