package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int f;
		int m;
		int k;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[n];
		int y;
		int[] z = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								x[i] = Integer.parseInt(tempVar2);
							}
							z[i] = 0;
		}
		for (j = 0;j <= n - 1;j++)
		{
							f = 0;
							for (l = 0;l <= j - 1;l++)
							{
												y = x[j] - x[l];
												if (y == 0)
												{
													f = 1;
												}
							}
							if (f == 0)
							{
								z[t] = x[j];
									  t += 1;
							}
		}
		for (m = 0;m <= n - 1;m++)
		{
							if (z[m] == 0)
							{
								break;
							}
		}
		for (k = 0;k <= m - 1;k++)
		{
			if (z[k] != 0)
			{
				System.out.printf("%d", z[k]);
			}
							if (k <= m - 2)
							{
								System.out.print(" ");
							}
		}
							return 0;
	}


}

