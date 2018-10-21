package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int m;
		int i;
		int j;
		int k;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[100][100]; //????
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					a[i][j] = '0'; //??????
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == k + '0') //??a[i][j]?????
				{
					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = k + '1';
					}
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = k + '1';
					}
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = k + '1';
					}
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = k + '1'; //??????
					}
				}
			}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] != '#' && a[i][j] != '.')
				{
					s = s + 1; //????????
				}
			}
		}
		System.out.print(s);
		System.out.print("\n");

		return 0;
	}
}

