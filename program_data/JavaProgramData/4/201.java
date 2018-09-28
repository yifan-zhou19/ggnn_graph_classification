package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
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
		for (i = 0;i < r + c - 1;i++)
		{
			if (i < c && c <= r)
			{
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",a[j][i - j]);
				}
			}
			else if (i >= c != 0 && c <= r != 0 && i < r)
			{
				for (j = i - c + 1;j <= i;j++)
				{
					System.out.printf("%d\n",a[j][i - j]);
				}
			}
			else if (i >= r != 0 && c <= r)
			{
				for (j = i - c + 1;j < r;j++)
				{
					System.out.printf("%d\n",a[j][i - j]);
				}
			}
			else if (i < r && c> r)
			{
				for (j = 0;j <= i;j++)
				{
					System.out.printf("%d\n",a[j][i - j]);
				}
			}
			else if (i >= r != 0 && c > r && i < c)
			{
				for (j = 0;j < r;j++)
				{
					System.out.printf("%d\n",a[j][i - j]);
				}
			}
			else if (i >= c != 0 && c > r)
			{
				for (j = i - c + 1;j < r;j++)
				{
					System.out.printf("%d\n",a[j][i - j]);
				}
			}
		}
		return 0;
	}
}

