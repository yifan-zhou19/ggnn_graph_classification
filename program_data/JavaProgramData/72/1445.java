package <missing>;

public class GlobalMembers
{
	public static int[][] moun = new int[30][30];
	public static int[][] high = new int[30][30];
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i <= row + 1;i++)
		{
			for (int j = 0;j <= col + 1;j++)
			{
			 moun[i][j] = 0;
			}
		}

		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				moun[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				if (moun[i][j] >= moun[i - 1][j] != 0 && moun[i][j] >= moun[i][j - 1] != 0 && moun[i][j] >= moun[i + 1][j] != 0 && moun[i][j] >= moun[i][j + 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}



		return 0;
	}


}

