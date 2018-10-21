package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int j;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] c = new char[102][102];
		char[][] d = new char[102][102];
		char ttt;
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		ttt = tempVar2.charAt(0);
	}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					c[i][j] = tempVar3.charAt(0);
				}
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				ttt = tempVar4.charAt(0);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = Integer.parseInt(tempVar5);
		}
		for (i = 1;i <= n;i++)
		{
				for (j = 1;j <= n;j++)
				{
					d[i][j] = c[i][j];
				}
		}
		for (k = 1;k < b;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (c[i][j] == '@')
					{
									 if (c[i + 1][j] == '.')
									 {
									 d[i + 1][j] = '@';
									 }
									 if (c[i - 1][j] == '.')
									 {
									 d[i - 1][j] = '@';
									 }
									 if (c[i][j + 1] == '.')
									 {
									 d[i][j + 1] = '@';
									 }
									 if (c[i][j - 1] == '.')
									 {
									 d[i][j - 1] = '@';
									 }
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					c[i][j] = d[i][j];
				}
			}
		}
		int js = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
				js++;
				}
			}
		}
		System.out.printf("%d",js);
		return 0;
	}
}

