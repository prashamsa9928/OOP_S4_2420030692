package mypractical;
import java.util.Scanner;

public class ReadAndPrintElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];  

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

      
        for (int num : arr) {
            System.out.println(num);
        }
	}

	}
