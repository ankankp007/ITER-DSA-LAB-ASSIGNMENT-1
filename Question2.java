package LabAssignment;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner (System.in);
		System.out.print("Enter your weight in kg :");
		double w= obj.nextDouble();
		System.out.print("Enter your height in met:");
		double h= obj.nextDouble();
		double BMI=w/(h*h);
		System.out.println("YOUR BMI is: "+ BMI); 

		if (BMI<18.5) {
			System.out.println("Underweight");

		}
		else if (BMI>=18.5 && BMI<=24.9) {
			System.out.println("Normal Weight");
		}
		else if (BMI>=25.0 && BMI<=29.9) {
			System.out.println("Overweight");

		}
		else {
			System.out.println("Obese");
		}

	}

}





