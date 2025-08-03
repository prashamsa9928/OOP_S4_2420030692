package mypackage;
import java.util.Scanner;

public class EnterZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the numbers");

        while (true) {
            int n = sc.nextInt(); 
            if (n == 0) {
                break;  
            }
            System.out.println("Entered: " + n);
        }

        System.out.println("Entered 0.");
		}

	}


