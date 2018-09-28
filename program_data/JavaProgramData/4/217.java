package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int n;
		int t;
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
		n = row + col;
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
		for (t = 0;t < n - 1;t++)
		{
			for (i = 0;i <= t;i++)
			{
				if (i < row && (t - i) < col)
				{
					System.out.printf("%d\n",a[i][t - i]);
				}
				else
				{
			continue;
				}
			}
		}
		return 0;
	}

}

