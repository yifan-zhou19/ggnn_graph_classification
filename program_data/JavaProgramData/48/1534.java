package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] germ = new int[11][11];
		int[][] a = new int[11][11];
		int i;
		int j;
		int k;
		int x;
		germ[5][5] = m;
		a[5][5] = m;
		for (k = 0;k < n;k++)
		{
						for (i = 1;i < 10;i++)
						{
										for (j = 1;j < 10;j++)
										{
														if (a[i][j] != 0)
														{

																	  germ[i - 1][j - 1] += a[i][j];
																	  germ[i - 1][j] += a[i][j];
																	  germ[i - 1][j + 1] += a[i][j];
																	  germ[i][j - 1] += a[i][j];
																	  germ[i][j + 1] += a[i][j];
																	  germ[i + 1][j - 1] += a[i][j];
																	  germ[i + 1][j] += a[i][j];
																	  germ[i + 1][j + 1] += a[i][j];
																	  germ[i][j] += a[i][j];
														}
										}
						}
						for (i = 0;i < 11;i++)
						{
										 for (j = 0;j < 11;j++)
										 {
														  a[i][j] = germ[i][j];
										 }
						}
		}
		for (i = 1;i < 10;i++)
		{
						for (j = 1;j < 9;j++)
						{
										System.out.printf("%d ",germ[i][j]);
						}
						System.out.printf("%d\n",germ[i][9]);
		}

	}

}

