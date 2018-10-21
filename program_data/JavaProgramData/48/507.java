package <missing>;

public class GlobalMembers
{
	//**************************************
	//*???????????                     
	//*????? 1100012780     	        
	//*???2011.11.23                     
	//**************************************

	public static int m; //?????
	public static int day; //??
	public static int[][] spread = new int[9][9];

	public static void bac(int n)
	{
		int i;
		int j;
		int[][] produce = new int[9][9];
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				if (spread[i][j] != 0)
				{
					produce[i][j] += 2 * spread[i][j]; //???????????????
					produce[i - 1][j - 1] += spread[i][j]; //???????
					produce[i - 1][j] += spread[i][j];
					produce[i - 1][j + 1] += spread[i][j];
					produce[i][j + 1] += spread[i][j];
					produce[i][j - 1] += spread[i][j];
					produce[i + 1][j - 1] += spread[i][j];
					produce[i + 1][j] += spread[i][j];
					produce[i + 1][j + 1] += spread[i][j];
				}
			}
		}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				spread[i][j] = produce[i][j];
			}
		}
		if (n == day) //???????????
		{
			for (i = 0;i <= 8;i++)
			{
				for (j = 0;j <= 8;j++)
				{
					if (j != 8)
					{
						System.out.print(spread[i][j]);
						System.out.print(" ");
					}
					else
					{
						System.out.print(spread[i][j]);
					}
				}
				if (i != 8)
				{
					System.out.print("\n");
				}
			}
			return;
		}
		bac(n + 1); //?????
	}

	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		spread[4][4] = m;
		bac(1);
		return 0;
	}

}

