package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int row;
		int col;
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
		if (row >= col)
		{
			t = col / 2;
		}
		else
		{
			t = row / 2;
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
		int rmax = row - 1;
		int rmin = 0;
		int cmax = col - 1;
		int cmin = 0;


	//	printf("%d",t);

		for (i = 0;i < t;i++)
		{
			for (j = cmin;j < cmax;j++)
			{
				System.out.printf("%d\n",a[rmin][j]);
			}
			for (j = rmin;j < rmax;j++)
			{
				System.out.printf("%d\n",a[j][cmax]);
			}
			for (j = cmax;j > cmin;j--)
			{
				System.out.printf("%d\n",a[rmax][j]);
			}
			for (j = rmax;j > rmin;j--)
			{
				System.out.printf("%d\n",a[j][cmin]);
			}
			rmax -= 1;
			rmin += 1;
			cmax -= 1;
			cmin += 1;
		}

		if (col % 2 != 0 && row >= col)
		{
			for (i = t;i < row - t;i++)
			{
				System.out.printf("%d\n",a[i][col / 2]);
			}
		}
		else if (row % 2 != 0 && row <= col)
		{
			for (i = t;i < col - t;i++)
			{
				System.out.printf("%d\n",a[row / 2][i]);
			}
		}

		return 0;
	}
}

