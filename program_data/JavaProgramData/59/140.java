package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		int[][] b = new int[102][102];
		int i;
		int j;
		int n;
		int m;
		int k;
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '\0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@')
					{
						b[i][j] = 1;
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == '@' && b[i][j] == 1)
					{
						if (a[i][j + 1] == '.')
						{
							a[i][j + 1] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '@';
						}
						if (a[i + 1][j] == '.')
						{
							a[i + 1][j] = '@';
						}
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '@';
						}
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		return 0;
	}
}

