package <missing>;

public class GlobalMembers
{
	/*
	* ????1000012865_1
	* ??????
	* ???2010-11-5
	* ???????
	*/
	public static int Main()
	{
		final int line = 6;
		final int list = 6;
		int[][] n = new int[line][list];
		int i;
		int j;
		int m;
		int max;
		int maxline;
		int maxlist;
		int k = 0;
		int[] t = new int[6];
		for (i = 1; i <= 5; i++)
		{
			for (j = 1; j <= 5; j++)
			{
				n[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= 5; i++)
		{
			max = n[i][1];
			maxline = i;
			maxlist = 1;
			for (j = 1; j <= 5; j++)
			{
				k = 0;
				if (n[i][j] > max)
				{
					max = n[i][j];
					maxline = i;
					maxlist = j;
				}
				if (j == 5)
				{
					for (m = 1; m <= 5; m++)
					{
						if (m != maxline && n[m][maxlist] < max)
						{
							k = 1;
							break;
						}
					}
					if (k == 0)
					{
						System.out.print(maxline);
						System.out.print(' ');
						System.out.print(maxlist);
						System.out.print(' ');
						System.out.print(n[maxline][maxlist]);
						System.out.print("\n");
						t[maxline] = 1;
					}
				}
			}
		}
		if (t[1] + t[2] + t[3] + t[4] + t[5] == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

