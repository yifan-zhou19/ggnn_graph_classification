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
		int l;
		int p;
		int q;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
		a[4][4] = n;
		for (;d > 0;d--)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a[i][j] != 0)
					{
						b[i][j] += a[i][j];
						for (p = i - 1;p <= i + 1;p++)
						{
							for (q = j - 1;q <= j + 1;q++)
							{
								b[p][q] += a[i][j];
							}
						}
						a[i][j] = 0;
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j != 8)
				{
					System.out.printf("%d ",a[i][j]);
				}
				else
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
		return 0;
	}
}

