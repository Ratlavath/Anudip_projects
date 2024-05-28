package srinivas;
import java.util.*;
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);

	    System.out.println("enter a number ");

	    int num=obj.nextInt();

	    int sum=0;

	    for(int i=0;i<=num;i=i+2)

	    {

	      sum=sum+i;

	    }

	    System.out.println(sum);
	}

}
