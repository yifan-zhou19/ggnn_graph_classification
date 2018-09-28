package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		for (int i = 0 ; i < row ; i++)
		{
			for (int j = 0 ; j < col ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int minrow = 0;
		int maxrow = row - 1;
		int mincol = 0;
		int maxcol = col - 1;
		int n = 0;
		int i = 0;
		int j = 0;
		int count = 0;
		for (; n > -1 ; n++)
		{
		/*for( ; minrow <= i && i <= maxrow && mincol <= j && j <= maxcol ;
				n % 2 == 0 ? n % 4 == 0 ? j ++ : j -- : n % 4 == 1 ? i ++ : i -- )
			cout << a[i][j] << endl ;*/
			if (n % 2 == 0)
			{
			if (n % 4 == 0)
			{
				for (; j <= maxcol ; j++)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					count++;
				}
				minrow++;
				j--;
				i++;
			}
			else
			{
				for (; j >= mincol ; j--)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					count++;
				}
				maxrow--;
				j++;
				i--;
			}
			}
		else
		{
			if (n % 4 == 1)
			{
				for (; i <= maxrow ; i++)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					count++;
				}
				maxcol--;
				i--;
				j--;
			}
			else
			{
				for (; i >= minrow ; i--)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					count++;
				}
				mincol++;
				i++;
				j++;
			}
		}
		if (count == row * col)
		{
			break;
		}
		}
		return 0;
	}
}

