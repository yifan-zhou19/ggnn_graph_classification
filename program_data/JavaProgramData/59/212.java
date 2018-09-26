package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k = 0;
		int s = 0;
		char[][] a = new char[101][101];
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					a[i][j] = (char)(65);
					s++;
				}
			}
		}
		int m;
		sum = s;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			i = 0;
			j = 0;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if ((int)(a[i][j]) == (64 + k))
					{
						if (a[i + 1][j] == '.')
						{
							sum++;
							a[i + 1][j] = (char)(65 + k);
						}
						if (a[i - 1][j] == '.')
						{
							sum++;
							a[i - 1][j] = (char)(65 + k);
						}
						if (a[i][j + 1] == '.')
						{
							sum++;
							a[i][j + 1] = (char)(65 + k);
						}
						if (a[i][j - 1] == '.')
						{
							sum++;
							a[i][j - 1] = (char)(65 + k);
						}
					}
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}





}

