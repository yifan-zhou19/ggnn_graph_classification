package <missing>;

public class GlobalMembers
{
	public static char[][] s = new char[110][110];
	public static char[][] s1 = new char[110][110];
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int ans;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m--;
		while (m-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(s1,s,(Character.SIZE / Byte.SIZE));
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (s[i][j] == '@')
					{
						a = i;
						b = j - 1;
						if (a >= 0 && a < n && b >= 0 && b < n)
						{
							if (s[a][b] == '.')
							{
								s1[a][b] = '@';
							}
						}
						a = i;
						b = j + 1;
						if (a >= 0 && a < n && b >= 0 && b < n)
						{
							if (s[a][b] == '.')
							{
								s1[a][b] = '@';
							}
						}
						a = i - 1;
						b = j;
						if (a >= 0 && a < n && b >= 0 && b < n)
						{
							if (s[a][b] == '.')
							{
								s1[a][b] = '@';
							}
						}
						a = i + 1;
						b = j;
						if (a >= 0 && a < n && b >= 0 && b < n)
						{
							if (s[a][b] == '.')
							{
								s1[a][b] = '@';
							}
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(s,s1,(Character.SIZE / Byte.SIZE));
		}
		ans = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s[i][j] == '@')
				{
					ans++;
				}
			}
		}
		System.out.printf("%d\n",ans);
	}
}

