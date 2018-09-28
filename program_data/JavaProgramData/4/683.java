package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			col = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			row = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < col;i++)
		{
			for (j = 0;j < row;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int p;
		for (p = 0;p < 2 * (row> col != 0?row:col) - 1;p++)
		{
			int k;
			for (k = 0;(p - k) >= 0;k++)
			{
					if (k < col && (p - k) < row)
					{
						System.out.printf("%d\n",a[k][p - k]);
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

