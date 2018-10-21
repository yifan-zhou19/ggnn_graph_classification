package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int k;
		int n;
		int d;
		char b;
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					b = tempVar3.charAt(0);
				}
				if (b == '.')
				{
					a[i][j] = -1;
				}
				else if (b == '@')
				{
					a[i][j] = 0;
				}
				else
				{
					a[i][j] = -2;
				}
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				t = tempVar4.charAt(0);
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			d = Integer.parseInt(tempVar5);
		}

		for (k = 0;k < d - 1;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == k)
					{
						if (a[i - 1][j] == -1)
						{
							a[i - 1][j] = k + 1;
						}
						if (a[i + 1][j] == -1)
						{
							a[i + 1][j] = k + 1;
						}
						if (a[i][j + 1] == -1)
						{
							a[i][j + 1] = k + 1;
						}
						if (a[i][j - 1] == -1)
						{
							a[i][j - 1] = k + 1;
						}
					}
				}
			}
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] >= 0)
				{
					k++;
				}
			}
		}
		System.out.printf("%d",k);
	 //   getch();
		return 0;
	}



}

