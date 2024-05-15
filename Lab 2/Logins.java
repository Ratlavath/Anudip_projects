package srinivas;
import java.util.Scanner;

public class Logins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner obj=new Scanner(System.in);
    System.out.println("enter user name\n");
    String name=obj.nextLine();
    System.out.println("enter password\n");
    int pass=obj.nextInt();
    if(name=="srinivas" && pass==1234)
    {
    	System.out.println("you'r successfully logged in");
    }
    else
    {
    	System.out.println("wrogn credentials");
    }
	}

}
