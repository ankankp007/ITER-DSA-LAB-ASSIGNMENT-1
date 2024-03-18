package LabAssignment;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner ( System.in);
		System.out.print("Enter the Integer:");
		int sum=0;
		int product=1;
		int x= obj.nextInt();
		while(x>0) {
			int r= x%10;
			x=x/10;
			sum=sum+r;
			product=product*r;
		}
		if ( sum==product) {
			System.out.println("The number is a Spy Number");
		}
		else {
			System.out.println(" Th number is not a spy Number");
		}
	}

}





