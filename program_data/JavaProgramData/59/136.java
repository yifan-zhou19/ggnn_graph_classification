package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[102][103];
		char[][] temp = new char[102][103];

		for (int i = 1; i <= n; i++)
		{
			a[i] + 1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(temp,a,102 * 103);
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int o = 0; o < m - 1; o++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= String.valueOf(a[i] + 1).length(); j++)
				{
					if (a[i][j] == '@')
					{
						if (a[i + 1][j] == '.')
						{
							temp[i + 1][j] = '@';
						}
						if (a[i - 1][j] == '.')
						{
							temp[i - 1][j] = '@';
						}
						if (a[i][j + 1] == '.')
						{
							temp[i][j + 1] = '@';
						}
						if (a[i][j - 1] == '.')
						{
							temp[i][j - 1] = '@';
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a,temp,102 * 103);
		}
		int c = 0;
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= String.valueOf(a[i] + 1).length(); j++)
				{
					if (a[i][j] == '@')
					{
						c++;
					}
				}
			}
			System.out.print(c);

	}


}

