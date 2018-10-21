package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] flag = new int[105][105];
		int i;
		int j;
		int m;
		int sum = 0;
		char[][] a = new char[105][105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a[i][j] == '#')
		{
		flag[i][j] = -1;
		}
		if (a[i][j] == '@')
		{
		flag[i][j] = 1;
		}
		if (a[i][j] == '.')
		{
		flag[i][j] == 0;
		}

			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2;k <= m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				 for (j = 1;j <= n;j++)
				 {
					  if (a[i][j] == '@' && flag[i][j] < k)
					  {
						  if (flag[i][j - 1] == 0)
						  {
							  a[i][j - 1] = '@';
							  flag[i][j - 1] = k;
						  }
					  if (flag[i][j + 1] == 0)
					  {
						  a[i][j + 1] = '@';
						  flag[i][j + 1] = k;
					  }
					  if (flag[i + 1][j] == 0)
					  {
						  a[i + 1][j] = '@';
						  flag[i + 1][j] = k;
					  }
					  if (flag[i - 1][j] == 0)
					  {
						  a[i - 1][j] = '@';
						  flag[i - 1][j] = k;
					  }
					  }
				 }
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
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

