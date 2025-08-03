package mypackage;
import java.util.Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("a++ is"+(a++));
        System.out.println("a-- is"+(a--));
        System.out.println("++a is"+(++a));
        System.out.println("--a is"+(a--));
		
}


	}


