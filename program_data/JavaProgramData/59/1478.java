package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int d = 1;
		int count = 0;
		char[][] c = new char[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (d < m)
		{
			for (i = 1;i <= n;i++)
			{
			  for (j = 1;j <= n;j++)
			  {
				if (c[i][j] == '.')
				{
					if ((c[i - 1][j] == '@') || (c[i][j - 1] == '@') || (c[i][j + 1] == '@') || (c[i + 1][j] == '@'))
					{
						c[i][j] = '*';
					}
				}
			  }
			}
			for (i = 1;i <= n;i++)
			{
			  for (j = 1;j <= n;j++)
			  {
				if (c[i][j] == '*')
				{
					c[i][j] = '@';
				}
			  }
			}
			d++;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
					count++;
				}
			}

		}
		System.out.print(count);
		System.out.print("\n");

		return 0;
	}





}

