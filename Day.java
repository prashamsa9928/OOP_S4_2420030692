package mypackage;
import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter day number:");
	     int num = sc.nextInt();
		String day;
	     if(num==1)
	     {
	    	day="Monday"; 
	     }
	     else if(num==2) {
	    	 day="Tuesday";
	     }
	     else if(num==3){
	    	 day="Wednesday";
	     }
	     else if(num==4) {
	    	 day="Thursday";
	     }
	     else if(num==5) {
	    	 day="Friday";
	     }
	     else if(num==6) {
	    	 day="Saturday"; 
	     }
	     else if (num == 7) {
	         day = "Sunday";
	     } 
	     else {
	         day = "Invalid";
	     }
		System.out.println("The day is:"+(day));

		}

	}


