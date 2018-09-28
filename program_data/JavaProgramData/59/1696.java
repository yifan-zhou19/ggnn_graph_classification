package <missing>;

public class GlobalMembers
{
	//******************
	//????**********
	public static int Main()
	{
		int n;
		int m;
		int i = 0;
		int j = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[102][102];
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int M = 1;M < m;M++)
		{
			for (i = 1;i <= n;i++)
			{
					for (j = 1;j <= n;j++)
					{
					  if (a[i][j] == '@')
					  {
							if (a[i - 1][j] == '.')
							{
								a[i - 1][j] = '$';
							}
							if (a[i + 1][j] == '.')
							{
								a[i + 1][j] = '$';
							}
							if (a[i][j - 1] == '.')
							{
								a[i][j - 1] = '$';
							}
							if (a[i][j + 1] == '.')
							{
								a[i][j + 1] = '$';
							}
					  }
					}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
						if (a[i][j] == '$')
						{
							a[i][j] = '@';
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
				sum = sum + 1;
				}
			}
		}
			System.out.print(sum);
			System.out.print("\n");
			return 0;
	}


}

