package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int p;
		char[][] s = new char[N][N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[j] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		k = 1;
		while (k < m)
		{
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (s[i][j] == '@')
					{
						if (i > 0 && s[i - 1][j] == '.')
						{
							s[i - 1][j] = '@' + 1;
						}
						if (j > 0 && s[i][j - 1] == '.')
						{
							s[i][j - 1] = '@' + 1;
						}
						if (i < n - 1 && s[i + 1][j] == '.')
						{
							s[i + 1][j] = '@' + 1;
						}
						if (j < n - 1 && s[i][j + 1] == '.')
						{
							s[i][j + 1] = '@' + 1;
						}
					}
				}
			}
			k++;
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < n;i++)
				{
					if (s[i][j] == '@' + 1)
					{
						s[i][j] = '@';
					}
				}
			}
		}
		p = 0;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (s[i][j] == '@')
				{
					p++;
				}
			}
		}
	System.out.printf("%d",p);
		return 0;
	}

}

