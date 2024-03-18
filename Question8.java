package LabAssignment;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the No elements of the Matrix :");
		Scanner obj=new Scanner(System.in);
		int x= obj.nextInt();
		int[] array=new int [x];

		System.out.print("Enter the number of rows :");
		int m=obj.nextInt();
		System.out.print("Enter the number of columns :");
		int n= obj.nextInt();
		int matrix [][]= new int [n][m];
		System.out.print("Enter the elements of the array:");
		for ( int i=0;i<x;i++) {
			array[i]= obj.nextInt();
		}


		int k = 0;
		for (int i=0;  i<m;i++) {
			for ( int j =0; j<n; j++,k++) {
				matrix[i][j]= array[k];
			}
		}
		//OUTPUT
		int sum=0;
		System.out.println("The elements of 2D array are:");

		for (int i=0;  i<m;i++) {
			for ( int j =0; j<n; j++) {
				System.out.print(matrix[i][j]+ " ");
				sum=sum+matrix[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of Elements : " + sum);
	}

}






