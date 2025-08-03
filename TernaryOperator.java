package mypackage;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
	    int a = sc.nextInt();
	    System.out.println("Enter b");
	    int b = sc.nextInt();
	    int greater = (a > b) ? a : b;
	     System.out.println("Greater variable:" + greater);
	  }

	}


