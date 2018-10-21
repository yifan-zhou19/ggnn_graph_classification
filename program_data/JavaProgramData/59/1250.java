package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int n;
		int m;
		int r = 0;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				  String tempVar2 = ConsoleInput.scanfRead(null, 1);
				  if (tempVar2 != null)
				  {
					  c[i][j] = tempVar2.charAt(0);
				  }
			}
		}


		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}



		while (k <= m)
		{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == ',')
				{
					c[i][j] = '@';
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
					if (c[i - 1][j] == '.')
					{
						c[i - 1][j] = ',';
					}
					if (c[i + 1][j] == '.')
					{
						c[i + 1][j] = ',';
					}
					if (c[i][j - 1] == '.')
					{
						c[i][j - 1] = ',';
					}
					if (c[i][j + 1] == '.')
					{
						c[i][j + 1] = ',';
					}

				}
			}
		}
		k++;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == '@')
				{
					r++;

				}
				;
			}
		}
		System.out.printf("%d",r);
		return 0;
	}

}

