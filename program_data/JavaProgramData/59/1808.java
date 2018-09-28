package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max = 110;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[max][max];
		char[][] b = new char[max][max];
		int i;
		int j;
		for (i = 0;i < max;i++)
		{
			for (j = 0;j < max;j++)
			{
				b[i][j] = '0';
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}

		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m-- != 0)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					b[i][j] = a[i][j];
				}
			}

			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (b[i][j] == '.' && (b[i - 1][j] == '@' || b[i + 1][j] == '@' || b[i][j - 1] == '@' || b[i][j + 1] == '@'))
					{
						a[i][j] = '@';
					}
				}
			}

		}

		int sum = 0;
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
		System.out.print("\n");

		return 0;
	}


}

