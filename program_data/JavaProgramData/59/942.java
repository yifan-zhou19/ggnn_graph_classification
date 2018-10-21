package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int num = 0;
		int i;
		int j;
		int day;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[][] flag = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					flag[i][j] = 2;
					num++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (day = 2; day <= m; day++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '@' && flag[i][j] <= day)
					{
						if (i + 1 < n && a[i + 1][j] == '.')
						{
							a[i + 1][j] = '@';
							flag[i + 1][j] = day + 1;
							num++;
						}
						if (i - 1 >= 0 && a[i - 1][j] == '.')
						{
							a[i - 1][j] = '@';
							flag[i - 1][j] = day + 1;
							num++;
						}
						if (j + 1 < n && a[i][j + 1] == '.')
						{
							a[i][j + 1] = '@';
							flag[i][j + 1] = day + 1;
							num++;
						}
						if (j - 1 >= 0 && a[i][j - 1] == '.')
						{
							a[i][j - 1] = '@';
							flag[i][j - 1] = day + 1;
							num++;
						}
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

