package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i;
		int j;
		int sum = 0;
		int n;
		int m;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n;i++)
		{
		for (j = 1; j <= n;j++)
		{
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m;k++)
		{
			for (i = 1; i <= n;i++) //????????
			{
			for (j = 1; j <= n;j++)
			{
				if (a[i][j] == '@' + k) //?????????
				{
					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = '@' + k + 1;
					}
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = '@' + k + 1;
					}
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = '@' + k + 1;
					}
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = '@' + k + 1;
					}
				}
			}
			}
		}
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
			for (k = 0;k < m;k++) //???????
			{
			if (a[i][j] == '@' + k)
			{
				sum++;
			}
			}
		}
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}

}

