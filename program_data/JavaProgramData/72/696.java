package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[22][22];
		int k = 0;
		int[] h = new int[410];
		int[] g = new int[410];
		int s;
		int t;
		int p;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i][0] = 0;
		a[i][n + 1] = 0;
		}
		for (j = 1;j <= n;j++)
		{
			a[0][j] = 0;
		 a[m + 1][j] = 0;
		}
		for (i = 1;i <= m;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}
		for (i = 1;i <= m;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
			 if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
			 {
					   h[k] = i - 1;
					   g[k] = j - 1;
					   k = k + 1;
			 }
		   }
		}
					s = k;
					for (k = 0;k < s;k++)
					{
					   for (i = k + 1;i < s;i++)
					   {
					   if (h[k] > h[i])
					   {
							   t = h[k];
							   h[k] = h[i];
							   h[i] = t;
							p = g[k];
							g[k] = g[i];
							g[i] = p;
					   }
					   }
					}
					   if (h[k] == h[i])
					   {
								if (g[k] > g[i])
								{
									t = g[k];
									g[k] = g[i];
									g[i] = t;
								}
					   }
				 for (k = 0;k < s;k++)
				 {
				 System.out.print(h[k]);
				 System.out.print(" ");
				 System.out.print(g[k]);
				 System.out.print("\n");
				 }
		System.in.read();
		return 0;
	}
}

