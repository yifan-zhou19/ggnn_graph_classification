package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int sum = 0;
		int i;
		int j;
		int k;
		char kg;
		char[][] sz = new char[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				kg = tempVar2.charAt(0);
			}
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					sz[i][j] = tempVar3.charAt(0);
				}
			}
		}

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}

		for (k = 0;k < m - 1;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (sz[i][j] == '@')
					{
						if (sz[i + 1][j] == '.')
						{
							sz[i + 1][j] = 'r';
						}
						if (sz[i - 1][j] == '.')
						{
							sz[i - 1][j] = 'r';
						}
						if (sz[i][j + 1] == '.')
						{
							sz[i][j + 1] = 'r';
						}
						if (sz[i][j - 1] == '.')
						{
							sz[i][j - 1] = 'r';
						}
					}
				}
			}



			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (sz[i][j] == 'r')
					{
						sz[i][j] = '@';
					}
				}
			}



		}





		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (sz[i][j] == '@')
				{
					sum++;
				}
			}
		}


		System.out.printf("%d\n",sum);








		return 0;
	}


}

