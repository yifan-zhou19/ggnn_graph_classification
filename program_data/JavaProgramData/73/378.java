package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int[][] a = new int[5][5]; //???????????
		int[][] b = new int[5][5]; //????????????????????
		int[][] c = new int[5][5]; //????????????????????
		int i;
		int j;
		int m = 0;
		int k;
			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
			b[i][j] = 0;
			}
			}
				for (i = 0;i < 5;i++)
				{
			for (j = 0;j < 5;j++)
			{
			c[i][j] = 0;
			}
				}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 5;k++)
				{
					if (a[i][j] > a[k][j])
					{
						break;
					}
					if (a[i][j] <= a[k][j] != 0 && k == 4)
					{
						b[i][j] = a[i][j]; //??????????
					}
				}
			}
		}
				for (i = 0;i < 5;i++)
				{
					for (j = 0;j < 5;j++)
					{
						for (k = 0;k < 5;k++)
						{
							if (a[i][j] < a[i][k])
							{
								break;
							}
							if (a[i][j] >= a[i][k] != 0 && k == 4)
							{
								c[i][j] = a[i][j]; //??????????
							}
						}
					}
				}
						for (i = 0;i < 5;i++)
						{
							for (j = 0;j < 5;j++)
							{
								if (b[i][j] == c[i][j] && b[i][j] != 0)
								{
									System.out.print(i + 1);
									System.out.print(" ");
									System.out.print(j + 1);
									System.out.print(" ");
									System.out.print(b[i][j]);
									System.out.print("\n");
										m++;

								}
							}
						}
					if (m == 0)
					{
					System.out.print("not found");
					System.out.print("\n");
					}

							return 0;
	}

}

