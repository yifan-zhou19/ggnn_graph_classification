package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] data = new int[30][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1 ; j <= n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1 ; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				int flag = 1;
				if (i > 1 && data[i - 1][j] > data[i][j])
				{
					flag = 0;
				}
				if (j > 1 && data[i][j - 1] > data[i][j])
				{
					flag = 0;
				}
				if (j < n && data[i][j + 1] > data[i][j])
				{
					flag = 0;
				}
				if (i < m && data[i + 1][j] > data[i][j])
				{
					flag = 0;
				}
				if (flag != 0)
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
			return 0;

	}
}

