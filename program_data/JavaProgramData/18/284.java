package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int s;
		int i;
		int j;
		int k;
		int m;
		int t;
		int[][] a = new int[100][100];
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n;
		for (i = 0;i < x;i++)
		{
			s = 0;
			n = x;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
			for (t = 1;t < x;t++)
			{
			for (j = 0;j < n;j++)
			{
				m = a[j][0];
				for (k = 1;k < n;k++)
				{
					if (a[j][k] < m)
					{
						m = a[j][k];
					}
				}
				for (k = 0;k < n;k++)
				{
					a[j][k] = a[j][k] - m;
				}
			}
			for (j = 0;j < n;j++)
			{
				m = a[0][j];
				for (k = 1;k < n;k++)
				{
					if (a[k][j] < m)
					{
						m = a[k][j];
					}
				}
				for (k = 0;k < n;k++)
				{
					a[k][j] = a[k][j] - m;
				}
			}
			s = s + a[1][1];
			for (j = 1;j < n - 1;j++)
			{
				a[0][j] = a[0][j + 1];
				a[j][0] = a[j + 1][0];
			}
			for (j = 1;j < n - 1;j++)
			{
				for (k = 1;k < n - 1;k++)
				{
					a[j][k] = a[j + 1][k + 1];
				}
			}
			n--;
			}
			System.out.printf("%d\n",s);
		}
	}
}

