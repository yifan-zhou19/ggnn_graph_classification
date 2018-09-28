package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int count = 0;
		int i;
		int j;
		int k;
		int l;
		int p;
		char d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < n;j++)
		   {
						   d = ConsoleInput.readToWhiteSpace(true).charAt(0);
						   if (d == '#')
						   {
							   b[i][j] = 1;
						   }
						   if (d == '@')
						   {
							   a[i][j] = 1;
						   }
		   }
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < n;j++)
			{
							for (k = 0;k < n;k++)
							{
											if (a[j][k] == 1 && j - 1 >= 0 && b[j - 1][k] == 0)
											{
												c[j - 1][k] = 1;
											}
											if (a[j][k] == 1 && k - 1 >= 0 && b[j][k - 1] == 0)
											{
												c[j][k - 1] = 1;
											}
											if (a[j][k] == 1 && j + 1 < n && b[j + 1][k] == 0)
											{
												c[j + 1][k] = 1;
											}
											if (a[j][k] == 1 && k + 1 < n && b[j][k + 1] == 0)
											{
												c[j][k + 1] = 1;
											}
							}

			}
			for (l = 0;l < n;l++)
			{
			   for (p = 0;p < n;p++)
			   {
				  if (c[l][p] == 1)
				  {
								c[l][p] = 0;
								a[l][p] = 1;
				  }
			   }
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
					 if (a[i][j] == 1)
					 {
						 count++;
					 }
			}
		}
		System.out.print(count);
		return 0;
	}

}

