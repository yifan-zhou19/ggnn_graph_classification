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
		int t = 0;
		char[][] p = new char[103][103];
		char[][] p1 = new char[103][103];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n + 2;j++)
		{
			p[0][j] = '.';
			p[n + 1][j] = '.';
		}
		for (i = 1;i < n + 1;i++)
		{
			p[i][0] = '.';
			for (j = 1;j < n + 1;j++)
			{
			  String tempVar2 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar2 != null)
			  {
				  p[i][j] = tempVar2.charAt(0);
			  }
			}
			p[i][n + 1] = '.';
			scanf("\n");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 2;k <= m;k++)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (j = 0;j < n + 1;j++)
				{
					p1[i][j] = p[i][j];
				}
			}
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if (p[i][j] == '.')
					{
						if (p1[i - 1][j] == '@' || p1[i + 1][j] == '@' || p1[i][j - 1] == '@' || p1[i][j + 1] == '@')
						{
							p[i][j] = '@';
						}
					}
				}
			}

		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (p[i][j] == '@')
				{
					t++;
				}
			}
		}
		System.out.printf("%d\n",t);
		return 0;
	}


}

