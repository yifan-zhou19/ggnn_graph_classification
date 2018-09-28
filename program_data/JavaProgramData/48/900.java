package <missing>;

public class GlobalMembers
{
	public static int[][] plate1 = new int[9][9]; // ??????
	public static int[][] plate = new int[9][9];
	public static void count(int k)
	{
		int i;
		int j;
		if (k == 0)
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 8; j++)
				{
					System.out.print(plate[i][j]);
					System.out.print(" ");
				}
				System.out.print(plate[i][j]);
				System.out.print("\n");
			}
			return;
		}
		else
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (plate[i][j] != 0)
					{
						if (i > 0 && j > 0)
						{
							plate1[i - 1][j - 1] = plate1[i - 1][j - 1] + plate[i][j];
						}
						if (j > 0)
						{
							plate1[i][j - 1] = plate1[i][j - 1] + plate[i][j];
						}
						if (i > 0 && j < 8)
						{
							plate1[i - 1][j + 1] = plate1[i - 1][j + 1] + plate[i][j];
						}
						if (j < 8)
						{
							plate1[i][j + 1] = plate1[i][j + 1] + plate[i][j];
						}
						if (i < 8 && j < 8)
						{
							plate1[i + 1][j + 1] = plate1[i + 1][j + 1] + plate[i][j];
						}
						if (i < 8)
						{
							plate1[i + 1][j] = plate1[i + 1][j] + plate[i][j];
						}
						if (i < 8 && j > 0)
						{
							plate1[i + 1][j - 1] = plate1[i + 1][j - 1] + plate[i][j];
						}
						if (i > 0)
						{
							plate1[i - 1][j] = plate1[i - 1][j] + plate[i][j];
						}
					}
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					plate[i][j] = plate[i][j] * 2 + plate1[i][j];
					plate1[i][j] = 0;
				}
			}
			count(k - 1);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		plate[4][4] = m;
		count(n);
		return 0;
	}
}

