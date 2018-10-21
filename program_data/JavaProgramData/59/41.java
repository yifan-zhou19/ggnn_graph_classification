package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[102][102];
		int[][] s = new int[102][102];
		int[][] s0 = new int[102][102];
		int n;
		int i;
		int j;
		int m;
		int k;
		int total;
		char[][] a = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 101;i++)
		{
			for (j = 0;j <= 101;j++)
			{
			s[i][j] = 1;
			p[i][j] = 0;
			s0[i][j] = 1;
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			switch (a[i][j - 1])
			{
				case '.':
				p[i][j] = 1;
				break;
				case '@':
				p[i][j] = 1;
				s[i][j] = 0;
				break;
				default:
				break;
			}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 1;k < m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
				if (p[i][j] != 0)
				{
					s0[i][j] = s[i][j] * s[i + 1][j] * s[i][j + 1] * s[i - 1][j] * s[i][j - 1];
				}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					s[i][j] = s0[i][j];
				}
			}
		}
		total = n * n;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				total = total - s[i][j];
			}
		}
		System.out.printf("%d",total);
		return 0;
	}
}

