package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int count = 0;
		char[][] a = new char[105][105];
		char[][] b = new char[105][105];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '#', (Character.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n;i++)
		{
			for (j = 1; j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < m; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(b, a, (Character.SIZE / Byte.SIZE));
			for (i = 1; i <= n;i++)
			{
				for (j = 1; j <= n;j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i - 1][j] == '.')
						{
							b[i - 1][j] = '@';
						}
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = '@';
						}
						if (a[i][j + 1] == '.')
						{
							b[i][j + 1] = '@';
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a, b, (Character.SIZE / Byte.SIZE));
		}
		for (i = 1; i <= n;i++)
		{
			for (j = 1; j <= n;j++)
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

