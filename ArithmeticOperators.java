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
	      System.out.println("Sum is:"+(a+b));
              System.out.println("Diff is:"+(a-b));
              System.out.println("Product is:"+(a*b));
              System.out.println("Quotient is:"+(a/b));
              System.out.println("Modulus is:"+(a%b));
        
	}

}

