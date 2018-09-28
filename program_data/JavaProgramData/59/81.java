package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] p = new char[102][102];
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					p[i][j] = tempVar2.charAt(0);
				}
				if (p[i][j] == '\n')
				{
					j--;
				}
			}
		}
		for (int i = 0;i <= n + 1;i++)
		{
			p[0][i] = p[n + 1][i] = p[i][0] = p[i][n + 1] = '#';
		}
		int m;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		while (m > 1)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (p[i][j] == '@')
					{
						if (p[i][j + 1] == '.')
						{
							p[i][j + 1] = '$';
						}
						if (p[i][j - 1] == '.')
						{
							p[i][j - 1] = '$';
						}
						if (p[i + 1][j] == '.')
						{
							p[i + 1][j] = '$';
						}
						if (p[i - 1][j] == '.')
						{
							p[i - 1][j] = '$';
						}
					}

				}

			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (p[i][j] == '$')
					{
						p[i][j] = '@';
					}
				}
			}

			m--;

			/*printf("Day %d\n", m);
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					printf("%c", p[i][j]);
				}
				
				printf("\n");
			}
			printf("\n");
	
	*/
		}


		int count = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (p[i][j] == '@')
				{
					count++;
				}
			}
		}

		System.out.printf("%d",count);

		//scanf("%d",&n);
		return 0;




	}
}

