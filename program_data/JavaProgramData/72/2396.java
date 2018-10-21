package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int judge;
		int[][] a = new int[20][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				judge = 1;
				if (i > 0)
				{
					judge = judge * (a[i][j] >= a[i - 1][j]);
				}
				if (j > 0)
				{
					judge = judge * (a[i][j] >= a[i][j - 1]);
				}
				if (i < m - 1)
				{
					judge = judge * (a[i][j] >= a[i + 1][j]);
				}
				if (j < n - 1)
				{
					judge = judge * (a[i][j] >= a[i][j + 1]);
				}
				if (judge == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}

		return 0;
	}

}

