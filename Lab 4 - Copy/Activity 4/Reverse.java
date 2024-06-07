package srinivas;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
	    System.out.println("enter a number ");
	    int num=obj.nextInt();
	    int sum=0;
	    for(int i=0;i<=num;i++)
	    {
	      int rem=num%10;
	      sum=sum*10+rem;
	      num=num/10;
	    }
	    System.out.println(sum);
	}

}
