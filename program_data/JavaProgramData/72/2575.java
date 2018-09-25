package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] height = new int[30][30];
		int i;
		int j;
		int k;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= row; i++)
		{
		 for (j = 1; j <= col; j++)
		 {
			 height[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		int[][] dir =
		{
			{-1, 0},
			{0, 1},
			{1, 0},
			{0, -1}
		};
		for (i = 1; i <= row; i++)
		{
		 for (j = 1; j <= col; j++)
		 {
			  for (k = 0; k < 4; k++)
			  {
				   int ii = i + dir[k][0];
				   int jj = j + dir[k][1];
				   if (height[i][j] < height[ii][jj])
				   {
					   break;
				   }
			  }
			  if (k == 4)
			  {
				  System.out.print(i - 1);
				  System.out.print(" ");
				  System.out.print(j - 1);
				  System.out.print("\n");
			  }
		 }
		}
		 return 0;
	}

}

