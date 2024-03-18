package LabAssignment;
import java.util.Scanner;
public class Question5 {
		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.print("Enter a number: ");
			int num = obj.nextInt();
			System.out.println("The number of digits in " + num + " are: " + count(num));
			System.out.println("The sum of digits is: " + sum_Of_Digits(num));
		}
		public static int sum_Of_Digits(int number) {
			int sum = 0;
			for(int i = 1; i <= count(number) + 1; i++) {
				while(number != 0) {
					int d = number % 10;
					sum = sum + d;
					number = number / 10;
				}
				number = sum;
				sum = 0;
			}
			return number;
		}
		public static int count(int number) {
			int count = 0;
			while(number != 0) {
				count++;
				number /= 10;
			}
			return count;
		}
	}




