package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int n;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = row * col;
		int[][] array = new int[row][col];
		int i;
		int j;
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				int a;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				array[i - 1][j - 1] = a;
			}
		}
		int mini = 0;
		int minj = 0;
		int k;
		for (k = 1;k <= n;)
		{
			if (j != col)
			{
				j = minj;
						  while (j < col)
						  {
								System.out.print(array[mini][j]);
								System.out.print("\n");
								k++;
								j++;
						  }
			}
			mini++;
			if (k > n)
			{
					break;
			}
			if (j == col)
			{
					   i = mini;
					   while (i < row)
					   {
							 System.out.print(array[i][col - 1]);
							 System.out.print("\n");
							 k++;
							 i++;
					   }
			}
			col--;
			if (k > n)
			{
					break;
			}
			if (i == row)
			{
					   j = col - 1;
					   while (j >= minj)
					   {
							 System.out.print(array[row - 1][j]);
							 System.out.print("\n");
							 k++;
							 j--;
					   }
			}
			row--;
			if (k > n)
			{
					break;
			}
			if (j < minj)
			{
					   i = row - 1;
					   while (i >= mini)
					   {
							 System.out.print(array[i][minj]);
							 System.out.print("\n");
							 k++;
							 i--;
					   }
			}
			minj++;
			if (k > n)
			{
					break;
			}
		}

		return 0;
	}
}

