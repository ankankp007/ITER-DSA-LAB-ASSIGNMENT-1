package LabAssignment;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter the poitive integer:");
		int x= obj.nextInt();
		int y=x;
		int count=0;
		while (y>=2) {
			y=y/2;
			if (y>=2)
				count++;

		}
		System.out.print("The number of times one must repeatedly didvide "+x+" by 2 before getting a value less than 2 is = " +count);
	}
}



