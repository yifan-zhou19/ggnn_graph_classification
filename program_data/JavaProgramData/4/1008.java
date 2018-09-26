package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int k;
		int j;
		int p;
		int[][] a = new int[123][123];
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
			for (k = 0;k <= row + col - 2;k = k + 1)
			{
				for (p = 0;p <= k;p++)
				{
					if (p < row && k - p < col)
					{
					System.out.printf("%d\n",a[p][k - p]);
					}
				}
			}
	return 0;
	}
}

