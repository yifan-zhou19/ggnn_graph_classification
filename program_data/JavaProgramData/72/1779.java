package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] mt = new int[20][20];
		int i;
		int j;
		int m;
		int n;
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
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < n;j++)
						{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							mt[i][j] = Integer.parseInt(tempVar3);
						}
						}
		}
		for (i = 0;i < m;i++)
		{
						for (j = 0;j < n;j++)
						{
										if (i == 0)
										{
												if (j == 0)
												{
														if (mt[0][0] >= mt[0][1] != 0 && mt[0][0] >= mt[1][0])
														{
														System.out.printf("%d %d\n",i,j);
														}
												}
												else if (j == n - 1)
												{
													 if (mt[0][n - 1] >= mt[1][n - 1] != 0 && mt[0][n - 1] >= mt[0][n - 2])
													 {
													 System.out.printf("%d %d\n",i,j);
													 }
												}
												else
												{
													if (mt[i][j] >= mt[i][j - 1] != 0 && mt[i][j] >= mt[i][j + 1] != 0 && mt[i][j] >= mt[i + 1][j])
													{
													 System.out.printf("%d %d\n",i,j);
													}
												}
										}
										else if (i == m - 1)
										{
											 if (j == 0)
											 {
														if (mt[i][j] >= mt[i][j + 1] != 0 && mt[i][j] >= mt[i - 1][j])
														{
														System.out.printf("%d %d\n",i,j);
														}
											 }
												else if (j == n - 1)
												{
													 if (mt[i][j] >= mt[i][j - 1] != 0 && mt[i][j] >= mt[i - 1][j])
													 {
													 System.out.printf("%d %d\n",i,j);
													 }
												}
												else
												{
													if (mt[i][j] >= mt[i - 1][j] != 0 && mt[i][j] >= mt[i][j - 1] & mt[i][j] >= mt[i][j + 1])
													{
													System.out.printf("%d %d\n",i,j);
													}
												}
										}
										else
										{
											if (j == 0)
											{
														if (mt[i][j] >= mt[i][j + 1] != 0 && mt[i][j] >= mt[i - 1][j] != 0 && mt[i][j] >= mt[i + 1][j])
														{
														System.out.printf("%d %d\n",i,j);
														}
											}
											 else if (j == n - 1)
											 {
												  if (mt[i][j] >= mt[i][j - 1] != 0 && mt[i][j] >= mt[i - 1][j] != 0 && mt[i][j] >= mt[i + 1][j])
												  {
														System.out.printf("%d %d\n",i,j);
												  }
											 }
											 else
											 {
												 if (mt[i][j] >= mt[i][j - 1] != 0 && mt[i][j] >= mt[i - 1][j] != 0 && mt[i][j] >= mt[i + 1][j] != 0 && mt[i][j] >= mt[i][j + 1])
												 {
														System.out.printf("%d %d\n",i,j);
												 }
											 }
										}
						}
		}
		return 0;
	}

}

