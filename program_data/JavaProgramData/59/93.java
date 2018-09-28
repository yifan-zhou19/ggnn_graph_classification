package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int n;
		int i;
		int j;
		int k;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			for (i = 0; i < n; i++)
			{
			  for (j = 0; j < n; j++)
			  {
				  if (a[i][j] == '@' && a[i - 1][j] == '.' && i != 0)
				  {
					  a[i - 1][j] = 'a';
				  }
				  if (a[i][j] == '@' && a[i + 1][j] == '.' && i != n - 1)
				  {
					  a[i + 1][j] = 'a';
				  }
				  if (a[i][j] == '@' && a[i][j - 1] == '.' && j != 0)
				  {
					  a[i][j - 1] = 'a';
				  }
				  if (a[i][j] == '@' && a[i][j + 1] == '.' && j != n - 1)
				  {
					  a[i][j + 1] = 'a';
				  }
			  }
			}
			 for (i = 0; i < n; i++)
			 {
			  for (j = 0; j < n; j++)
			  {
				  if (a[i][j] == 'a')
				  {
					  a[i][j] = '@';
				  }
			  }
			 }
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n;j++)
			{
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

