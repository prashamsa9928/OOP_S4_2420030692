package mypackage;
import java.util.Scanner;

public class PassOrFail{

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	          System.out.println("Passed theory exam (true/false)? ");
	          boolean theory = sc.nextBoolean();
	          System.out.println("Passed practical exam (true/false)? ");
	          boolean practical = sc.nextBoolean();
                  if (theory && practical)
	              System.out.println("Passed both the exams.");
	          else
	              System.out.println("Didn't pass both the exams.");
	  }

	}


