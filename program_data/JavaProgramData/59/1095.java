package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int num;
		char[][] a = new char[N][N];
		char[][] b = new char[N][N];
		int i;
		int j;
		int r;

		for (i = 0;i < N;i++)
		{
			for (j = 0;j < N;j++)
			{
				a[i][j] = '\0';
				b[i][j] = '\0';
			}
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			System.in.read();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			b[i] = a[i];
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		for (r = 1;r <= m - 1;r++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@')
					{
						if (b[i][j + 1] == '.' && j + 1 < n)
						{
							b[i][j + 1] = '@';
						}

						if (b[i][j - 1] == '.' && j - 1 >= 0)
						{
							b[i][j - 1] = '@';
						}

						if (b[i + 1][j] == '.' && i + 1 < n)
						{
							b[i + 1][j] = '@';
						}

						if (b[i - 1][j] == '.' && i - 1 >= 0)
						{
							b[i - 1][j] = '@';
						}
					}
				}
			}

			for (i = 0;i < n;i++)
			{
				a[i] = b[i];
			}

			/*for(i=0,num=0;i<n;i++)
			{
			    puts(a[i]);
			}
			printf("\n");*/

		}


		for (i = 0,num = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			  if (a[i][j] == '@')
			  {
				num++;
			  }

			}
		}

		System.out.printf("%d\n",num);


		return 0;
	}
}

