package mypackage;
import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for bitwise and shift operations
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("\n--- Bitwise Operations ---");
        System.out.println("a & b (AND) = " + (a & b));
        System.out.println("a | b (OR) = " + (a | b));
        System.out.println("a ^ b (XOR) = " + (a ^ b));
        

  }


	}

