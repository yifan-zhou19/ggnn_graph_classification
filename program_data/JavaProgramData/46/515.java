package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int b;
		int c;
		int d;
		int i;
		int j;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < b;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		if (b < c)
		{
			d = b;
		}
		if (b >= c)
		{
			d = c;
		}
		if (d % 2 == 0)
		{
			for (e = 0;e < d / 2;e++)
			{
				i = e;
				for (j = e;j < c - 1 - e;j++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				j = c - 1 - e;
				for (i = e;i < b - 1 - e;i++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				i = b - 1 - e;
				for (j = c - e-1;j > e;j--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				j = e;
				for (i = b - 1 - e;i > e;i--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
		if (d % 2 != 0)
		{
			for (e = 0;e < d / 2;e++)
			{
				i = e;
				for (j = e;j < c - 1 - e;j++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				j = c - 1 - e;
				for (i = e;i < b - 1 - e;i++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				i = b - 1 - e;
				for (j = c - e-1;j > e;j--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
				j = e;
				for (i = b - 1 - e;i > e;i--)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
			if (d == b && d != c)
			{
				j = d / 2;
				for (i = d / 2;i < c - d / 2;i++)
				{
					System.out.printf("%d\n",a[j][i]);
				}
			}
			if (d == c && d != b)
			{
				j = d / 2;
				for (i = d / 2;i < b - d / 2;i++)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
			if (d == c && d == b)
			{
				i = j = d / 2;
				System.out.printf("%d",a[i][j]);
			}
		}

	}

}

