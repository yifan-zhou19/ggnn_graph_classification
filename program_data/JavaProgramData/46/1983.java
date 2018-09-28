package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][100];
		int[] b = new int[10000];
		int[] c = new int[4];
		int m;
		int n;
		int e;
		int i;
		int j;
		int t;
		int k;
		int l;
		int p;
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
				c[0] = i;
					c[1] = j;
					c[2] = m - i - 1;
					c[3] = n - j - 1;
					t = c[0];
			for (k = 0;k < 4;k++)
			{
				if (c[k] < t)
				{
					t = c[k];
				}
			}
				if (i == t)
				{
					p = j - t + 1;
				}
				else if (j == n - t - 1)
				{
					p = n - t - 1 - t + i - t + 1;
				}
				else if (i == m - t - 1)
				{
					p = n - t - 1 - t + m - t - 1 - t + n - t - 1 - j + 1;
				}
				else if (j == t)
				{
					p = n - t - 1 - t + m - t - 1 - t + n - t - 1 - t + m - t - 1 - i + 1;
				}
			for (l = 0,e = 0;l < t;l++)
			{
				e = e+2 * (m - 2 * l - 1) + 2 * (n - 2 * l - 1);
			}
			if (t == 0)
			{
				e = 0;
			}
				   b[e + p - 1] = a[c[0]][c[1]];
			}
		}
			for (i = 0;i < m * n;i++)
			{
			System.out.printf("%d\n",b[i]);
			}
	}


}

