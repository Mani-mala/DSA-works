package dsa_classtimecodes;
public class SudukoSolver {
	private static final int size=9;
	public static void main(String[] args) {
  int[][] board = {{7,0,2,0,5,0,6,0,0},
				{0,0,0,0,0,3,0,0,0},
				{1,0,0,0,0,9,5,0,0},
				{8,0,0,0,0,0,0,9,0},
				{0,4,3,0,0,0,7,5,0},
				{0,9,0,0,0,0,0,0,8},
				{0,0,9,7,0,0,0,0,5},
				{0,0,0,2,0,0,0,0,0},
				{0,0,7,0,4,0,2,0,3}};
  printBoard(board);
  if(solveBoard(board))
  {
	  System.out.println("Solved successfully!..... :)");
  }
  else
  {
	  System.out.println("Unsolved!!...");
  }
  printBoard(board);
	}
	private static void printBoard(int[][] board) {
		for(int i=0;i<size;i++)
		{
			if(i%Math.sqrt(size)==0 && i!=0)
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for(int j=0;j<size;j++)
			{
				if(j%Math.sqrt(size)==0 && j!=0)
					System.out.print(" | ");
				System.out.print(" "+board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	private static boolean solveBoard(int[][] board) {
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(board[i][j]==0) {
					for(int num=1;num<=size;num++)
					{
						if(isValidPlacement(board,num,i,j))
						{
							board[i][j]=num;
							if(solveBoard(board))
								return true;
							else
								board[i][j]=0;
						}
					}
					return false;
				}
			}
		}
		return true;
		
	}
	private static boolean isValidPlacement(int[][] board, int num, int i, int j) {
		return !isNumInRow(board,num,i) && !isNumInColumn(board,num,j) && !isNumInBox(board,num,i,j);
	}
	private static boolean isNumInBox(int[][] board, int num, int i, int j) {
		int boxrow=(int) (i- i% Math.sqrt(size));
		int boxcolumn=(int) (j-j%Math.sqrt(size));
		for(int k=boxrow;k<boxrow+(int)Math.sqrt(size);k++)
		{
			for(int l=boxcolumn;l<boxcolumn+(int)Math.sqrt(size);l++)
			{
				if(board[k][l]==num)
					return true;
			}
		}
		return false;
	}
	private static boolean isNumInColumn(int[][] board, int num, int j) {
		for(int k=0;k<size;k++)
		{
			if(board[k][j]==num)
				return true;
		}
		return false;
	}
	private static boolean isNumInRow(int[][] board, int num, int i) {
		for(int k=0;k<size;k++)
		{
			if(board[i][k]==num)
				return true;
		}
		return false;
	}

}
