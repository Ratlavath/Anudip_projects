package srinivas;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter a number ");
	    int num=obj.nextInt();
	    int sum=1;
	    for(int i=1;i<=num;i++)
	    {
	      sum=i*sum;
	    }
	    System.out.println(num+"!:"+sum);

	}

}
