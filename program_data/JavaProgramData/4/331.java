package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int i;
		int j;
		int m;
		int t;
		int p;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= b - 1;i++)
		{
			for (j = 0;j <= c - 1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (m = 0;m <= b + c - 2;m++)
		{
			if (m < b && m < c)
			{
				for (i = 0;i <= m;i++)
				{
				System.out.printf("%d\n",a[i][m - i]);
				}
			}
			else if (m >= b != 0 && m >= c)
			{
				for (i = m - c + 1;i <= b - 1;i++)
				{
				System.out.printf("%d\n",a[i][m - i]);
				}
			}
			else
			{
				if (b < c)
				{
					for (i = 0;i <= b - 1;i++)
					{
				System.out.printf("%d\n",a[i][m - i]);
					}

				}
				else
				{
					for (i = m - c + 1;i <= m;i++)
					{
					System.out.printf("%d\n",a[i][m - i]);
					}
				}
			}
		}
		return 0;
	}

}

