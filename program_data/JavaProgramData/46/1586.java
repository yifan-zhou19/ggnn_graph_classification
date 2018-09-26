package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int n0;
		int m0;
		int p;
		int q;
		int[][] a = new int[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= m ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		n0 = n / 2 + n % 2;
		m0 = m / 2 + m % 2;
		if (n0 > m0)
		{
			 q = m0;
		}
		else
		{
			 q = n0;
		}
		for (p = 1, n0 = 1, m0 = 1 ; p <= q ; p++, n0++, m0++, n--, m--)
		{
			if (m == m0)
			{
				  for (i = n0 ; i <= n ; i++)
				  {
					  System.out.print(a[i][m]);
					  System.out.print("\n");
				  }
				  break;
			}
			if (n == n0)
			{
				  for (j = m0 ; j <= m ; j++)
				  {
					  System.out.print(a[n][j]);
					  System.out.print("\n");
				  }
				  break;
			}
			for (j = m0 ; j <= m - 1 ; j++)
			{
				System.out.print(a[n0][j]);
				System.out.print("\n");
			}
			for (i = n0 ; i <= n - 1 ; i++)
			{
				System.out.print(a[i][m]);
				System.out.print("\n");
			}
			for (j = m ; j >= m0 + 1 ; j--)
			{
				System.out.print(a[n][j]);
				System.out.print("\n");
			}
			for (i = n ; i >= n0 + 1 ; i--)
			{
				System.out.print(a[i][m0]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

