package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] q = new int[22][22];
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
		for (i = 1;i < m;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i][j] = Integer.parseInt(tempVar3);
				}
			}
			scanf("\n");
		}
		for (i = m,j = 1;j < n + 1;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				q[i][j] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < m + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				if (i == 0 || j == 0 || i == m + 1 || j == n + 1)
				{
					q[i][j] = 0;
				}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (q[i][j] >= q[i + 1][j] != 0 && q[i][j] >= q[i][j + 1] != 0 && q[i][j] >= q[i - 1][j] != 0 && q[i][j] >= q[i][j - 1])
				{
					d = i - 1;
					e = j - 1;
					System.out.printf("%d %d\n",d,e);
				}
			}
		}
		return 0;
	}
}

