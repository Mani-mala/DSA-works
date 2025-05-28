package biweekly_test;

import java.util.Arrays;
public class SetMatrixZero {
	public static void main(String[] args) {
		int input[][]= {{1,1,1,1},{1,0,1,1},{1,0,1,1}};
		System.out.println("Input array : "+Arrays.deepToString(input));
		System.out.println("After set matrix zero array : "+Arrays.deepToString(setMatrixZero(input)));
	}
	public static int[][] setMatrixZero(int[][] input)
	{
		boolean[][] check=new boolean[input.length][input[0].length];
		int n=input.length;
		int m=input[0].length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(input[i][j]==0)
				{
				for(int k=0;k<m;k++)
				{
					check[i][k]=true;
				}
				for(int k=0;k<n;k++)
				{
					check[k][j]=true;
				}	
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(check[i][j])
				{
					input[i][j]=0;
				}
			}
		}
		return input;
	}

}
