package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int m;
		int n;
		int[][] dk = new int[100][100];
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
		for (a = 1;a <= m;a++)
		{
			for (b = 1;b <= n;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					dk[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= n + 1;i++)
		{
			dk[0][i] = 0;
		}
			dk[m + 1][i] = 0;
		for (i = 0;i <= m + 1;i++)
		{
			dk[i][0] = 0;
		}
			dk[i][n + 1] = 0;
		for (a = 1;a < m + 1;a++)
		{
			for (b = 1;b < n + 1;b++)
			{
				if ((dk[a][b] >= dk[a - 1][b]) && (dk[a][b] >= dk[a + 1][b]) && (dk[a][b] >= dk[a][b - 1]) && (dk[a][b] >= dk[a][b + 1]))
				{
				   System.out.printf("%d %d\n",a - 1,b - 1);
				}
			}
		}
	return 0;
	}
}

