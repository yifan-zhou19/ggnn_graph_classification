package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] jun1 = new int[9][9];
		int[][] jun2 = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jun1[4][4] = jun2[4][4] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (jun1[i][j] != 0)
					{
						jun2[i - 1][j] += jun1[i][j];
						jun2[i + 1][j] += jun1[i][j];
						jun2[i][j - 1] += jun1[i][j];
						jun2[i][j + 1] += jun1[i][j];
						jun2[i - 1][j - 1] += jun1[i][j];
						jun2[i + 1][j - 1] += jun1[i][j];
						jun2[i - 1][j + 1] += jun1[i][j];
						jun2[i + 1][j + 1] += jun1[i][j]; //8?????????????
						jun2[i][j] = 2 * jun1[i][j] + jun2[i][j] - jun1[i][j]; //??????????
					}
				}
			}
			for (i = 0;i < 9;i++) //????
			{
				for (j = 0;j < 9;j++)
				{
					jun1[i][j] = jun2[i][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j == 8)
				{
					System.out.print(jun1[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(jun1[i][j]);
					System.out.print(' ');
				}
			}
		}
		return 0;
	}
}

