package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int t1;
		int t2 = 0;
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
		for (t1 = 0;t1 < row;t1++)
		{
			if (t2 == row * col)
			{
				break;
			}
			for (j = t1;j < col - t1;j++)
			{
				System.out.printf("%d\n",a[t1][j]);
				t2++;
			}
			if (t2 == row * col)
			{
				break;
			}
			for (i = t1 + 1;i < row - t1;i++)
			{
				System.out.printf("%d\n",a[i][col - t1 - 1]);
				t2++;
			}
			if (t2 == row * col)
			{
				break;
			}
			for (j = col - t1 - 2;j >= t1;j--)
			{
				System.out.printf("%d\n",a[row - t1 - 1][j]);
				t2++;
			}
			if (t2 == row * col)
			{
				break;
			}
			for (i = row - t1 - 2;i >= t1 + 1;i--)
			{
				System.out.printf("%d\n",a[i][t1]);
				t2++;
			}
			if (t2 == row * col)
			{
				break;
			}
		}
		return 0;
	}
}

