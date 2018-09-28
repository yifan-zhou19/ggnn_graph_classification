package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int m;
		int n;
		int r;
		int s;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < 9;j++)
		{
			for (i = 0;i < 9;i++)
			{
				a[j][i] = 0;
				b[j][i] = 0;
			}
		}
		a[4][4] = m;
		b[4][4] = m;
		for (t = 1;t <= n;t++)
		{
			for (r = 4 - t;r <= 2 + t;r++)
			{
				for (s = 4 - t;s <= 2 + t;s++)
				{
					for (j = 0;j <= 2;j++)
					{
						for (i = 0;i <= 2;i++)
						{
							a[r + j][s + i] += b[r + 1][s + 1];
						}
					}
				}
			}
				for (j = 0;j < 9;j++)
				{
						for (i = 0;i < 9;i++)
						{
							b[j][i] = a[j][i];
							//a[j][i]=0;
						}
				}

		}
		for (j = 0;j < 9;j++)
		{
			for (i = 0;i < 8;i++)
			{
				System.out.printf("%d ",b[j][i]);
			}
			System.out.printf("%d\n",b[j][8]);
		}



		return 0;
	}


}

