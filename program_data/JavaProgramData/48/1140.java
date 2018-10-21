package <missing>;

public class GlobalMembers
{
	//**************************
	//**�y3�?o&#207;&#184;&#190;�?&#196;��&#214;3�&#235;�&#169;�?**
	//**��&#213;&#223;?oo&#206;?�			  **
	//**�&#188;&#228;?o2013.12.8		  **
	//**&#206;&#196;&#188;t&#195;&#251;?o2.cpp		  **
	//**************************
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int g;
		int[][] cnt = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cnt[4][4] = m;
		for (i = 0; i < n; i++)
		{
			int[][] sq = new int[9][9];
			for (j = 0; j < 9; j++)
			{
				for (g = 0; g < 9; g++)
				{
					if (cnt[j][g] != 0)
					{
						sq[j][g] += cnt[j][g];
						if (j + 1 < 9)
						{
							sq[j + 1][g] += cnt[j][g];
							if (g + 1 < 9)
							{
								sq[j + 1][g + 1] += cnt[j][g];
							}
							if (g - 1 >= 0)
							{
								sq[j + 1][g - 1] += cnt[j][g];
							}
						}
						if (j - 1 >= 0)
						{
							sq[j - 1][g] += cnt[j][g];
							if (g + 1 < 9)
							{
								sq[j - 1][g + 1] += cnt[j][g];
							}
							if (g - 1 >= 0)
							{
								sq[j - 1][g - 1] += cnt[j][g];
							}
						}
						if (g + 1 < 9)
						{
							sq[j][g + 1] += cnt[j][g];
						}
						if (g - 1 >= 0)
						{
							sq[j][g - 1] += cnt[j][g];
						}
					}
				}
			}
			for (j = 0; j < 9; j++)
			{
				for (g = 0; g < 9; g++)
				{
					cnt[j][g] += sq[j][g];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j < 8)
				{
					System.out.print(cnt[i][j]);
					System.out.print(' ');
				}
				else
				{
					System.out.print(cnt[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

