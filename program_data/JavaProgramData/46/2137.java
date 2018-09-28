package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int s_row = 0;
		int s_col = 0;
		int e_row = row - 1;
		int e_col = col - 1;
		while (true)
		{
			if (s_row > e_row)
			{
				break;
			}
			for (i = s_col;i <= e_col;i++)
			{
				System.out.printf("%d\n",a[s_row][i]);
			}
			s_row++;
			if (s_col > e_col)
			{
				break;
			}
			for (i = s_row;i <= e_row;i++)
			{
				System.out.printf("%d\n",a[i][e_col]);
			}
			e_col--;
			if (s_row > e_row)
			{
				break;
			}
			for (i = e_col;i >= s_col;i--)
			{
				System.out.printf("%d\n",a[e_row][i]);
			}
			e_row--;
			if (s_col > e_col)
			{
				break;
			}
			for (i = e_row;i >= s_row;i--)
			{
				System.out.printf("%d\n",a[i][s_col]);
			}
			s_col++;
		}
	}
}

