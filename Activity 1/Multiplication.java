package srinivas;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter a number ");
	    int num=obj.nextInt();
	    int sum=0;
	    for(int i=1;i<=10;i++)
	    {
	      sum=i*num;
	      System.out.println(num+"x"+i+"="+sum);
	    }
	}

}
