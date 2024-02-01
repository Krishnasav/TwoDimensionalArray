package twoDimensionalArray;

import java.util.Scanner;

public class OutputUsingNestedLopps 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		System.out.print("Enter the Number:-");
		int m = arr.length;  //no of row
		int n = arr[0].length; //no of cols
		//System.out.println(n);
		
		//Input of 2D array
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		//OutPut of 2D Array
		
		for(int i=0; i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
