package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n + 2][n + 2];
		char[][] b = new char[n + 2][n + 2];
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(b,a,(Character.SIZE / Byte.SIZE));
			for (int j = 1;j <= n;j++)
			{
				for (int k = 1;k <= n;k++)
				{
					if (a[j][k] == '@')
					{
						if (a[j][k - 1] == '.')
						{
							b[j][k - 1] = '@';
						}
						if (a[j][k + 1] == '.')
						{
							b[j][k + 1] = '@';
						}
						if (a[j + 1][k] == '.')
						{
							b[j + 1][k] = '@';
						}
						if (a[j - 1][k] == '.')
						{
							b[j - 1][k] = '@';
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a,b,(Character.SIZE / Byte.SIZE));
		}
		for (int i = 1;i <= n;i++)
		{
				for (int j = 1;j <= n;j++)
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

