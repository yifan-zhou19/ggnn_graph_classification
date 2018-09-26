package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int s = 0;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		char[][] c = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			for (j = 0;j < n;j++)
			{
				if (c[i][j] == '.')
				{
					a[i][j] = 0;
				}
				else if (c[i][j] == '#')
				{
					a[i][j] = -99999999;
				}
				else if (c[i][j] == '@')
				{
					a[i][j] = 100;
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
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] > 0)
					{
						b[i][j] = 1;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b[i][j] == 1)
					{
						a[i][j - 1]++;
						a[i][j + 1]++;
						a[i - 1][j]++;
						a[i + 1][j]++;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > 0)
				{
					s++;
				}
			}
		}
		System.out.printf("%d\n",s);
	return 0;
	}
}

