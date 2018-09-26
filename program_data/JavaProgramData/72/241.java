package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		 int i;
		 int j;
		 int k;
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
	int[][] p = new int[m];
	for (i = 0;i < m;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	}

	for (i = 0;i < m;i++)
	{
					for (j = 0;j < n;j++)
					{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[i][j] = Integer.parseInt(tempVar3);
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
													if (p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i + 1][j])
													{
													System.out.printf("%d %d\n",i,j);
													}
											}
											else if (j == n - 1)
											{
													if (p[i][j] >= p[i][j - 1] != 0 && p[i][j] >= p[i + 1][j])
													{
													System.out.printf("%d %d\n",i,j);
													}
											}
											else
											{
												if (p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i + 1][j] != 0 && p[i][j] >= p[i][j - 1])
												{
												System.out.printf("%d %d\n",i,j);
												}
											}
									}
									else if (i == m - 1)
									{
											if (j == 0)
											{
													if (p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i - 1][j])
													{
													System.out.printf("%d %d\n",i,j);
													}
											}
											 else if (j == n - 1)
											 {
													if (p[i][j] >= p[i][j - 1] != 0 && p[i][j] >= p[i - 1][j])
													{
													System.out.printf("%d %d\n",i,j);
													}
											 }
											else
											{
												if (p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i - 1][j] != 0 && p[i][j] >= p[i][j - 1])
												{
												System.out.printf("%d %d\n",i,j);
												}
											}
									}
									else
									{
												if (j == 0)
												{
													if (p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i + 1][j] != 0 && p[i][j] >= p[i - 1][j])
													{
													System.out.printf("%d %d\n",i,j);
													}
												}
											   else if (j == n - 1)
											   {
													if (p[i][j] >= p[i][j - 1] != 0 && p[i][j] >= p[i + 1][j] != 0 && p[i][j] >= p[i - 1][j])
													{
													System.out.printf("%d %d\n",i,j);
													}
											   }
												else
												{
												if (p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i + 1][j] != 0 && p[i][j] >= p[i][j - 1] != 0 && p[i][j] >= p[i - 1][j])
												{
												System.out.printf("%d %d\n",i,j);
												}
												}
									}

					}
	}
	System.in.read();
	System.in.read();

	}
}

