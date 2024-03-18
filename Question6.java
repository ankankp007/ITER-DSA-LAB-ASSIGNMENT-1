package LabAssignment;
import java.util.Scanner;

public class Question6 {

	public static void main(String arags[]) {
		Scanner obj =new Scanner(System.in);
		System.out.print("Enter the number:");
		int n =obj.nextInt();
		boolean b =isOdd(n);
		if(b==true)
			System.out.println(n+" is an odd Number :"+ b);
		else
			System.out.println(n+" is an odd number :"+b);
	}
	public static boolean isOdd(int n) {

		while(n>1){

			n =n-2;
		}
		if(n==1){

			return true;
		}
		else
			return false;
	}
}

