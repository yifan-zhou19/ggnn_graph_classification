package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int rowmin;
		int rowmax;
		int colmin;
		int colmax;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		rowmax = row;
		rowmin = 1;
		colmax = col;
		colmin = 1;
		while (true)
		{
			if (rowmax < rowmin || colmax < colmin)
			{
				break;
			}
			else if (rowmax == rowmin)
			{
				for (j = colmin;j <= colmax;j++)
				{
					System.out.printf("%d\n",a[rowmin][j]);
				}
			}
			else if (colmax == colmin)
			{
				for (i = rowmin;i <= rowmax;i++)
				{
					System.out.printf("%d\n",a[i][colmin]);
				}
			}
			else
			{
				for (j = colmin;j <= colmax;j++)
				{
					System.out.printf("%d\n",a[rowmin][j]);
				}
				for (i = rowmin + 1;i <= rowmax;i++)
				{
					System.out.printf("%d\n",a[i][colmax]);
				}
				for (j = colmax - 1;j >= colmin;j--)
				{
					System.out.printf("%d\n",a[rowmax][j]);
				}
				for (i = rowmax - 1;i > rowmin;i--)
				{
					System.out.printf("%d\n",a[i][colmin]);
				}
			}
			rowmax -= 1;
			rowmin += 1;
			colmax -= 1;
			colmin += 1;
		}
		return 0;
	}

}

