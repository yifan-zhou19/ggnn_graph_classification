package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int min;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = m = n;
		while (k-- != 0)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			while (--m != 0)
			{
				for (i = 0;i <= m;i++)
				{
					min = a[i][0];
					for (j = 0;j <= m;j++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					if (min != 0)
					{
						for (j = 0;j <= m;j++)
						{
							a[i][j] -= min;
						}
					}
				}
				for (i = 0;i <= m;i++)
				{
					min = a[0][i];
					for (j = 0;j <= m;j++)
					{
						if (a[j][i] < min)
						{
							min = a[j][i];
						}
					}
					if (min != 0)
					{
						for (j = 0;j <= m;j++)
						{
							a[j][i] -= min;
						}
					}
				}
				sum += a[1][1];
				for (i = 1;i < m;i++)
				{
					a[0][i] = a[0][i + 1];
				}
				for (i = 1;i < m;i++)
				{
					a[i][0] = a[i + 1][0];
				}
				for (i = 1;i < m;i++)
				{
					for (j = 1;j < m;j++)
					{
						a[i][j] = a[i + 1][j + 1];
					}
				}
			}
			System.out.printf("%d\n",sum);
			sum = 0;
			m = n;
		}
		return 0;
	}
}

