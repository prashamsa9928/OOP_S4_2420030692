package mypackage;
import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a");
	      int a=sc.nextInt();
	      System.out.println("Enter b");
	      int b=sc.nextInt();
	      System.out.println("Addition of a and b is:" + (a+b));
	      System.out.println("Subtraction of a and b is:" + (a-b));
	      System.out.println("Multiplication of a and b is:"+ (a*b));
	      System.out.println("Division of a and b is:" + (a/b));
	      System.out.println("Modulus of a and b is:" + (a%b));
        
	}

}
