package <missing>;

public class GlobalMembers
{
	public static int juzhen(int m,int n)
	{
		int[][] a = new int[100][100];
		int s = 0;
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
					for (j = 1;j <= n;j++)
					{
						a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
		}
		int[] p = a;
		for (i = 1;i <= n;i++)
		{
			s += *(p[1] + i);
		}
		  for (i = 2;i <= m;i++)
		  {
			  s += *(p[i] + n);
		  }
		  for (i = n - 1;i >= 1;i--)
		  {
			  s += *(p[m] + i);
		  }
		  for (i = m - 1;i > 1;i--)
		  {
			  s += *(p[i] + 1);
		  }
		  return s;
	}
	public static int Main()
	{
		int k;
		int m;
		int n;
		int t;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= k;t++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(juzhen(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

