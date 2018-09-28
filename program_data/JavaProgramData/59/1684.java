package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int m;
		int n;
		int i;
		int j;
		int d;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n + 2][n + 2];
		char[][] b = new char[n + 2][n + 2];
		for (i = 0; i <= n + 1; i++)
		{
			for (j = 0; j <= n + 1 ; j++)
			{
				a[i][j] = '#';
				b[i][j] = '#';
			}
		}



		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (d = 1; d <= m; d++)
		{
			if (d % 2 == 1)
			{
				 for (i = 1; i <= n; i++)
				 {
					 for (j = 1; j <= n; j++)
					 {
						 if (a[i][j] == '@')
						 {
							  b[i][j] = '@';
							  if (b[i - 1][j] != '#')
							  {
								   b[i - 1][j] = '@';
							  }
							  if (b[i + 1][j] != '#')
							  {
								   b[i + 1][j] = '@';
							  }
							  if (b[i][j - 1] != '#')
							  {
								   b[i][j - 1] = '@';
							  }
							  if (b[i][j + 1] != '#')
							  {
								   b[i][j + 1] = '@';
							  }
						 }
					 }
				 }
			}
			if (d % 2 == 0)
			{
				 for (i = 1; i <= n; i++)
				 {
					 for (j = 1; j <= n; j++)
					 {
						 if (b[i][j] == '@')
						 {
							  a[i][j] = '@';
							  if (a[i - 1][j] != '#')
							  {
								   a[i - 1][j] = '@';
							  }
							  if (a[i + 1][j] != '#')
							  {
								   a[i + 1][j] = '@';
							  }
							  if (a[i][j - 1] != '#')
							  {
								   a[i][j - 1] = '@';
							  }
							  if (a[i][j + 1] != '#')
							  {
								   a[i][j + 1] = '@';
							  }
						 }
					 }
				 }
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (m % 2 == 1)
				{
					 if (a[i][j] == '@')
					 {
						  count++;
					 }
				}
				if (m % 2 == 0)
				{
					 if (b[i][j] == '@')
					 {
						  count++;
					 }
				}
			}
		}

		System.out.print(count);
		System.out.print("\n");


	}



}

