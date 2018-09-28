package <missing>;

public class GlobalMembers
{
	public static int Main() //??????
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int d;
		char[][] a = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (d > 1)
		{
			d--;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@') //???????????????
					{
						if (i > 0 && a[i - 1][j] == '.')
						{
							a[i - 1][j] = '$';
						}
						if (j > 0 && a[i][j - 1] == '.')
						{
							a[i][j - 1] = '$';
						}
						if (i < n - 1 && a[i + 1][j] == '.')
						{
							a[i + 1][j] = '$';
						}
						if (j < n - 1 && a[i][j + 1] == '.')
						{
							a[i][j + 1] = '$';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '$')
					{
						a[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
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

