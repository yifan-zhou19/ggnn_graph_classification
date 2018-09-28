package <missing>;

public class GlobalMembers
{
	public static int j;
	public static int k;
	public static int[][] bec = new int[9][9];
	public static int[][] tempbec = new int[9][9];
	public static void increase(int[][] bec)
	{
		bec[j - 1][k] += tempbec[j][k];
		bec[j - 1][k - 1] += tempbec[j][k];
		bec[j - 1][k + 1] += tempbec[j][k];
		bec[j][k - 1] += tempbec[j][k];
		bec[j][k + 1] += tempbec[j][k];
		bec[j + 1][k - 1] += tempbec[j][k];
		bec[j + 1][k] += tempbec[j][k];
		bec[j + 1][k + 1] += tempbec[j][k];
	}



	public static int Main()
	{
		int m;
		int n;
		int i = 0;
		int num = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bec[4][4] = m;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 9; j++)
			{
				for (k = 0; k < 9; k++)
				{
					tempbec[j][k] = bec[j][k];
					bec[j][k] = bec[j][k] * 2;

				}
			}
			for (j = 1; j < 8; j++)
			{
				for (k = 1; k < 8; k++)
				{
					increase(bec);
				}
			}
		}
		for (j = 0; j < 9; j++)
		{
				for (k = 0; k < 9; k++)
				{
					if (num % 9 == 1)
					{
						System.out.print(bec[j][k]);
					}
					if (num % 9 == 0)
					{
						System.out.print(" ");
						System.out.print(bec[j][k]);
						System.out.print("\n");
					}
					if (num % 9 != 0 && num % 9 != 1)
					{
						System.out.print(" ");
						System.out.print(bec[j][k]);
					}
					num++;

				}
		}


		return 0;
	}


}

