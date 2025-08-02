package mypackage;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int no = sc.nextInt();
	    if(no%2==0)
	    	System.out.println("It's an even number");
	    else
	    	System.out.println("It's a odd number");
	    
		}


	}

