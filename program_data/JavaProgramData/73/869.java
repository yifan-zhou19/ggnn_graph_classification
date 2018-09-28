package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int y;
		int z;
		int[][] a = new int[5][5];
		int d;
		d = 0;
		for (i = 0;i < 5;i++)
		{
						for (j = 0;j < 5;j++)
						{
										String tempVar = ConsoleInput.scanfRead();
										if (tempVar != null)
										{
											a[i][j] = Integer.parseInt(tempVar);
										}
						}
		}
		for (i = 0;i < 5;i++)
		{
						for (j = 0;j < 5;j++)
						{
										for (k = 0;k < 5;k++)
										{
														if (j != k && a[i][j] <= a[i][k])
														{
															break;
														}
										}
										if (k == 5)
										{
												for (k = 0;k < 5;k++)
												{
																if (i != k && a[i][j] >= a[k][j])
																{
																	break;
																}
												}
												if (k == 5)
												{
														System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
														d++;
												}
										}
						}
		}
		if (d == 0)
		{
			System.out.print("not found");
		}

	}


}

