package mypackage;
import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a");
        int a = sc.nextInt();
        System.out.print("Enter b");
        int b = sc.nextInt();
        System.out.println("AND Operator = " + (a & b));
        System.out.println("OR Operator = " + (a | b));
        System.out.println("XOR Operator = " + (a ^ b));
        System.out.println("COMPLEMENT Operator of a = " + (~a));
	System.out.println("COMPLEMENT Operator of b = " + (~b));  
        

  }


	}


