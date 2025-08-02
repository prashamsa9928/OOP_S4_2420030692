package project;
import java.util.Scanner;

public class MultipleStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Length: " + input.length());
        System.out.println("Contains 'Java': " + input.contains("Java"));
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
        }

	}

}
