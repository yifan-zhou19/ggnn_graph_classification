package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int i1;
		int i2;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int h;
		int s;
		for (i1 = 0;i1 < 9;i1++)
		{
			for (i2 = 0;i2 < 9;i2++)
			{
				a[i1][i2] = 0;
				b[i1][i2] = 0;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[4][4] = m;
		b[4][4] = m;
		for (i = 0;i < n;i++)
		{
			for (i1 = 0;i1 < 9;i1++)
			{
				for (i2 = 0;i2 < 9;i2++)
				{
					if (a[i1][i2] != 0)
					{
						b[i1][i2] += a[i1][i2];
						if (i1 - 1 >= 0)
						{
							if (i2 - 1 >= 0)
							{
								b[i1 - 1][i2 - 1] += a[i1][i2];
							}
							b[i1 - 1][i2] += a[i1][i2];
							if (i2 + 1 < 9)
							{
								b[i1 - 1][i2 + 1] += a[i1][i2];
							}
						}
						if (i2 - 1 >= 0)
						{
							b[i1][i2 - 1] += a[i1][i2];
						}
						if (i2 + 1 < 9)
						{
							b[i1][i2 + 1] += a[i1][i2];
						}
						if (i1 + 1 < 9)
						{
							if (i2 - 1 >= 0)
							{
								b[i1 + 1][i2 - 1] += a[i1][i2];
							}
							b[i1 + 1][i2] += a[i1][i2];
							if (i2 + 1 < 9)
							{
								b[i1 + 1][i2 + 1] += a[i1][i2];
							}
						}
					}
				}
			}
			for (h = 0;h < 9;h++)
			{
				for (s = 0;s < 9;s++)
				{
					a[h][s] = b[h][s];
				}
			}

		}
			for (i1 = 0;i1 < 9;i1++)
			{
			for (i2 = 0;i2 < 9;i2++)
			{
				if (i2 != 8)
				{
					System.out.printf("%d ", a[i1][i2]);
				}
				else
				{
					System.out.printf("%d\n", a[i1][i2]);
				}
			}
			}
		return 0;
	}


}

