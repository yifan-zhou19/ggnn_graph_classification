package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[100][100];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			if (n <= m)
			{
				for (i = 0;i < n;i++)
				{
					for (j = 0;j < 5;j++)
					{
						if (j < 4)
						{
						System.out.printf("%d ",x[i][j]);
						}
						else
						{
							System.out.printf("%d\n",x[i][j]);
						}
					}
				}
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
					System.out.printf("%d ",x[m][j]);
					}
					else
					{
						System.out.printf("%d\n",x[m][j]);
					}
				}
				for (i = n + 1;i < m;i++)
				{
					for (j = 0;j < 5;j++)
					{
						if (j < 4)
						{
						System.out.printf("%d ",x[i][j]);
						}
						else
						{
							System.out.printf("%d\n",x[i][j]);
						}
					}
				}
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",x[n][j]);
					}
					else
					{
						System.out.printf("%d\n",x[n][j]);
					}
				}
				for (i = m + 1;i < 5;i++)
				{
					for (j = 0;j < 5;j++)
					{
						if (j < 4)
						{
						System.out.printf("%d ",x[i][j]);
						}
						else
						{
							System.out.printf("%d\n",x[i][j]);
						}
					}
				}
			}
			else
			{
					for (i = 0;i < m;i++)
					{
					for (j = 0;j < 5;j++)
					{
						if (j < 4)
						{
						System.out.printf("%d ",x[i][j]);
						}
						else
						{
							System.out.printf("%d\n",x[i][j]);
						}
					}
					}
				for (j = 0;j < 5;j++)
				{
						if (j < 4)
						{
					System.out.printf("%d ",x[n][j]);
						}
						else
						{
							System.out.printf("%d\n",x[n][j]);
						}
				}
				for (i = m + 1;i < n;i++)
				{
					for (j = 0;j < 5;j++)
					{
						if (j < 4)
						{
						System.out.printf("%d ",x[i][j]);
						}
						else
						{
							System.out.printf("%d\n",x[i][j]);
						}
					}
				}
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",x[m][j]);
					}
					else
					{
						System.out.printf("%d\n",x[m][j]);
					}
				}
				for (i = n + 1;i < 5;i++)
				{
					for (j = 0;j < 5;j++)
					{
						if (j < 4)
						{
						System.out.printf("%d ",x[i][j]);
						}
						else
						{
								System.out.printf("%d\n",x[i][j]);
						}
					}
				}
			}
		}
		else
		{
					System.out.print("error");
		}


		return 0;
	}

}

