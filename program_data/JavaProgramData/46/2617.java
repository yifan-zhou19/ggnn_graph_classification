package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] n = new int[100][100];
		int[][] d = new int[100][100];
		int r;
		int c;
		int i;
		int j;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < r;i++)
		{
			scanf("\n");
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n[i][j] = Integer.parseInt(tempVar3);
				}
		d[i][j] = 1;
			}

		}
		i = 0;
		j = 0;
		g = 0;
		for (f = 1;f <= r * c;f++)
		{
			System.out.printf("%d\n",n[i][j]);
			d[i][j] = 0;
			if (g == 0)
			{
			if (j < c - 1 && d[i][j + 1] != 0)
			{
				j++;
			g = 0;
			}
				else if (i < r - 1 && d[i + 1][j] != 0)
				{
					i++;
				g = 0;
				}
					else if (j > 0 && d[i][j - 1] != 0)
					{
						j--;
					g = 0;
					}
						else if (i > 0 && d[i - 1][j] != 0)
						{
							i--;
							g = 1;
						}
			}
			else
			{
				if (i > 0 && d[i - 1][j] != 0)
				{
							i--;
							g = 1;
				}
				else if (j < c - 1 && d[i][j + 1] != 0)
				{
					j++;
				g = 0;
				}

			}

		}
	}



}

