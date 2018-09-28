package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[110][110];
	public static int n;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};

	public static int Main()
	{
		int m;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0 ; i < 110 ; i++)
		{
			for (j = 0 ; j < 110 ; j++)
			{
				a[i][j] = '#';
			}
		}
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m != 0)
		{
			char[][] t = new char[110][110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(t, a, (Character.SIZE / Byte.SIZE));
			for (i = 1 ; i <= n ; i++)
			{
				for (j = 1 ; j <= n ; j++)
				{
					if (a[i][j] == '@')
					{
						for (k = 0 ; k < 4 ; k++)
						{
							if (a[i + dx[k]][j + dy[k]] == '.')
							{
								t[i + dx[k]][j + dy[k]] = '@';
							}
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a, t, (Character.SIZE / Byte.SIZE));
			m--;
		}
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
	}
}

