package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[][] a = new int[120][120];
		int m;
		int s;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			m = n;
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < m;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			s = 0;
			while (m >= 2)
			{
				for (j = 0;j < m;j++)
				{
					d = 0;
					for (l = 1;l < m;l++)
					{
						if (a[j][l] < a[j][d])
						{
							d = l;
						}
					}
					d = a[j][d];
					for (k = 0;k < m;k++)
					{
						a[j][k] = a[j][k] - d;
					}
				}
				for (j = 0;j < m;j++)
				{
					d = 0;
					for (l = 1;l < m;l++)
					{
						if (a[l][j] < a[d][j])
						{
							d = l;
						}
					}
					d = a[d][j];
					for (k = 0;k < m;k++)
					{
						a[k][j] = a[k][j] - d;
					}
				}
				s = s + a[1][1];
				for (j = 0;j < m;j++)
				{
					for (k = 2;k < m;k++)
					{
						a[j][k - 1] = a[j][k];
					}
				}
				for (j = 0;j < m - 1;j++)
				{
					for (k = 2;k < m;k++)
					{
						a[k - 1][j] = a[k][j];
					}
				}
				m--;
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

