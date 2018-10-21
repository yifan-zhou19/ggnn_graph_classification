package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] state = new char[100][101];
		char[][] str = new char[100][101];
		int n;
		int m;
		int i;
		int j;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			state[i] = new Scanner(System.in).nextLine();
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		m = m - 1;
		for (i = 0;i < n;i++)
		{
			str[i] = state[i];
		}
		while (m-- != 0)
		{
			for (i = 0;i < n;i++)
			{
				state[i] = str[i];
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (state[i][j] == '@')
					{
						if (i - 1 >= 0 && state[i - 1][j] == '.')
						{
							str[i - 1][j] = '@';
						}
						if (j - 1 >= 0 && state[i][j - 1] == '.')
						{
							str[i][j - 1] = '@';
						}
						if (i + 1 < n && state[i + 1][j] == '.')
						{
							str[i + 1][j] = '@';
						}
						if (j + 1 < n && state[i][j + 1] == '.')
						{
							str[i][j + 1] = '@';
						}
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			state[i] = str[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (state[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.printf("%d",count);
		return 0;
	}
}

