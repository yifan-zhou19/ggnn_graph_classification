package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[200][200];
		int n;
		int m;
		int i;
		int j;
		int l;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= m - 1;i++)
		{
			for (j = 1;j <= n;j++)
			{
				l = String.valueOf(s[j]).length();
				for (t = 0;t < l;t++)
				{
					if (s[j][t] == '@')
					{
						if (s[j + 1][t] == '.')
						{
							s[j + 1][t] = 'a';
						}
						if (s[j - 1][t] == '.')
						{
							s[j - 1][t] = 'a';
						}
						if (s[j][t + 1] == '.')
						{
							s[j][t + 1] = 'a';
						}
						if (s[j][t - 1] == '.')
						{
							s[j][t - 1] = 'a';
						}
					}
				}
			}
			for (j = 1;j <= n;j++)
			{
				l = String.valueOf(s[j]).length();
				for (t = 0;t < l;t++)
				{
					if (s[j][t] == 'a')
					{
						s[j][t] = '@';
					}
				}
			}
		}
			k = 0;
			for (j = 1;j <= n;j++)
			{
				l = String.valueOf(s[j]).length();
				for (t = 0;t < l;t++)
				{
					if (s[j][t] == '@')
					{
						k++;
					}
				}
			}
			System.out.printf("%d",k);
	}
}

