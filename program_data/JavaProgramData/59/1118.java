package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d;
		int k;
		int m = 0;
		char[][] a = new char[200][200];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = tempVar2.charAt(0);
				}
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					a[i][j] = 1;
				}
				else if (a[i][j] == '#')
				{
					a[i][j] = 110;
				}
				else if (a[i][j] == '.')
				{
					a[i][j] = 109;
				}



			}
		}

		if (d != 1)
		{
			for (k = 1;k < d;k++)
			{
				for (i = 0;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
						if (a[i][j] == k && a[i + 1][j] == 109 && i != n - 1)
						{
							a[i + 1][j] = k + 1;
						}
					}
				}

				for (i = 0;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
						if (a[i][j] == k && a[i - 1][j] == 109 && i != 0)
						{
							a[i - 1][j] = k + 1;
						}
					}
				}

				for (i = 0;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
						if (a[i][j] == k && a[i][j + 1] == 109 && j != n - 1)
						{
							a[i][j + 1] = k + 1;
						}
					}
				}

				for (i = 0;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
						   if (a[i][j] == k && a[i][j - 1] == 109 && j != 0)
						   {
							   a[i][j - 1] = k + 1;
						   }
					}
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] != 109 && a[i][j] != 110)
				{
					m++;
				}
			}
		}


			System.out.printf("%d",m);
			return 0;

	}

}

