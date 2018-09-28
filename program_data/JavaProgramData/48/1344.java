package <missing>;

public class GlobalMembers
{
	public static int[][] vi = new int[9][9];
	public static int[][] cp = new int[9][9];
	public static int m;
	public static int n;
	public static int[][] em = new int[9][9];
	public static void go_on(int x)
	{
		int p;
		int q;
		int i;
		int j;
		if (x == 1)
		{
			for (i = -1; i <= 1; i++)
			{
				for (j = -1; j <= 1; j++)
				{
					if ((i != 0) || (j != 0))
					{
						em[4 + i][4 + j] += vi[4][4];
					}
					else
					{
						em[4 + i][4 + j] += vi[4][4] * 2;
					}
				}
			} // ????????????em?????????
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					vi[i][j] = vi[i][j] + em[i][j] - cp[i][j];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(cp,vi,9 * 9 * 4);
			for (i = 0; i <= 8; i++)
			{
				for (j = 0; j <= 8; j++)
				{
					em[i][j] = 0;
				}
			}
			return;
		}
		if (x > 1) // ??x = 2
		{
			go_on(x - 1);
			for (p = 5 - x; p <= x + 3; p++)
			{
				for (q = 5 - x; q <= x + 3; q++)
				{
					for (i = -1;i <= 1; i++)
					{
						for (j = -1; j <= 1; j++)
						{
							if ((i != 0) || (j != 0))
							{
								em[p + i][q + j] += vi[p][q];
							}
							else
							{
								em[p + i][q + j] += vi[p][q] * 2;
							}
						}
					}
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					vi[i][j] = vi[i][j] + em[i][j] - cp[i][j];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(cp,vi, 9 * 9 * 4);
			for (i = 0; i <= 8; i++)
			{
				for (j = 0; j <= 8; j++)
				{
					em[i][j] = 0;
				}
			}
		}
	}
	public static int Main()
	{
		int i; // i??????m??????????n???
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		vi[4][4] = m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(cp, vi, 9 * 9 * 4);
		go_on(n);
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j != 8)
				{
				System.out.print(vi[i][j]);
				System.out.print(" ");
				}
				else
				{
					System.out.print(vi[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

