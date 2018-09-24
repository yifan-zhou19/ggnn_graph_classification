package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int[][] x = new int[101][101];
		int[][] y = new int[101][101];
		int j;
		int m;
		int n;
		int t;
		int s;
		int r;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] i = new int[101];
		for (r = 0;r < n;r++)
		{
			q = System.in.read();
			for (i[r] = 1;;i[r]++)
			{
				a[r][i[r]] = System.in.read();
			if (a[r][i[r]] == '\n')
			{
				a[r][i[r]] = 0;
				break;
			}
			}

		   for (j = 1;;j++)
		   {
			   b[r][j] = System.in.read();
		   if (b[r][j] == '\n')
		   {
			   b[r][j] = 0;
			   break;
		   }
		   }

		   for (m = 1;m < i[r];m++)
		   {
			a[r][m] = a[r][m] - 48;
		   }
		   for (m = 1;m < j;m++)
		   {
			b[r][m] = b[r][m] - 48;
		   }

		   for (m = 1;m < i[r];m++)
		   {
			x[r][m] = a[r][i[r] - m];
		   }
		   for (m = 1;m < j;m++)
		   {
			y[r][m] = b[r][j - m];
		   }

		   for (m = i[r];m < 101;m++)
		   {
			   x[r][m] = 0;
		   }
		   for (m = j;m < 101;m++)
		   {
			   y[r][m] = 0;
		   }
		   for (m = 0;m < 101;m++)
		   {
			   c[r][m] = 0;
		   }

		   for (m = 1;m < i[r];m++)
		   {
			   c[r][m] = (x[r][m] + 10 - y[r][m]) % 10;
			x[r][m + 1] = x[r][m + 1] + (x[r][m] + 10 - y[r][m]) / 10 - 1;
		   }
		}

		System.out.print("\n");
		for (r = 0;r < n;r++)
		{
			for (s = 0,t = i[r] - 1;t > 0;t--)
			{
				if (c[r][t] == 0 && s == 0)
				{
					continue;
				}
			System.out.printf("%d",c[r][t]);
			s = 1;
			}
			System.out.print("\n");
		}
	}

}

