package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m;
	int k = 0;
	int l;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] s =
	{
		{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};


	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
		   String tempVar2 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar2 != null)
		   {
			   s[i][j] = tempVar2.charAt(0);
		   }
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (l = 0;l < m;l++)
	{

		for (a = 1;a <= n;a++)
		{
			for (b = 1;b <= n;b++)
			{
			   if (s[a][b] == '-')
			   {
				s[a][b] = '@';
			   }
			}
		}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{

			if (s[i][j] == '@')
			{

				if (s[i - 1][j] == '.')
				{
					s[i - 1][j] = '-';
				}
				if (s[i + 1][j] == '.')
				{
					s[i + 1][j] = '-';
				}
				if (s[i][j + 1] == '.')
				{
					s[i][j + 1] = '-';
				}
				if (s[i][j - 1] == '.')
				{
					s[i][j - 1] = '-';
				}
			}
		}
	}
	}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (s[i][j] == '@')
			{
				k++;
			}
		}
	}
	System.out.printf("%d",k);
	return 0;
	}
}

