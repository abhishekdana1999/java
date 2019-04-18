import java.util.*;

class RowCol 
{
	public static void main(String args[]) 
	{
		int arr[][] = new int[3][3];
		int row[] = new int[3];
		int col[] = new int[3];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Values In Array");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = scn.nextInt();
			}
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("/n" + arr[i][j] + "\t");
			}
		}
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				row[i] += arr[i][j];
			}
		}
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				col[i] += arr[j][i];
			}
		}

		System.out.println("Row Sum Of Maxtrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("/n" + row[i] + "\t");
			}
		}

		System.out.println("Col Sum Of Maxtrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("/n" + col[i] + "\t");
			}
		}	
}
}