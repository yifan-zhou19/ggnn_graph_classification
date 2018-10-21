package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] a = new char[102][102];
	   int n;
	   int m;
	   int i;
	   int j;
	   int k;
	   int[][] p =
	   {
		   {0, 1},
		   {0, -1},
		   {1, 0},
		   {-1, 0}
	   };

			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i <= n + 1;i++)
		 {
		  for (j = 0;j <= n + 1;j++)
		  {
			a[i][j] = '#';
		  }
		 }

		 for (i = 1;i <= n;i++)
		 {
		 for (j = 1;j <= n;j++)
		 {
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 }
		 }
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (m > 1)
		{
			m--;
		 for (i = 1;i <= n;i++)
		 {
			for (j = 1;j <= n;j++)
			{
			 if (a[i][j] == '@')
			 {
				 for (k = 0;k < 4;k++)
				 {
				if (a[i + p[k][0]][j + p[k][1]] == '.')
				{
					a[i + p[k][0]][j + p[k][1]] = '*';
				}
				 }
			 }
			}
		 }
		 for (i = 1;i <= n;i++)
		 {
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == '*')
					{
						a[i][j] = '@';
					}
				}
		 }
		}
		int ans = 0;
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
		if (a[i][j] == '@')
		{
			ans++;
		}
				}
		}
		System.out.print(ans);
			return 0;
	}
}

