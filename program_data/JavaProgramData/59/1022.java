package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int num = 0;
		char[][] a = new char[110][110];
		char[][] myroom = new char[110][110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i < m;i++)
		{
			for (int l = 0;l < n;l++)
			{
				for (int k = 0;k < n;k++)
				{
					myroom[l][k] = a[l][k];
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
				if (myroom[i][j] == '@')
				{
					if (i - 1 >= 0 && a[i - 1][j] == '.')
					{
						a[i - 1][j] = '@';
					}
					if (i + 1 < n && a[i + 1][j] == '.')
					{
						a[i + 1][j] = '@';
					}
					if (j - 1 >= 0 && a[i][j - 1] == '.')
					{
						a[i][j - 1] = '@';
					}
					if (j + 1 < n && a[i][j + 1] == '.')
					{
						a[i][j + 1] = '@';
					}
				}

				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

