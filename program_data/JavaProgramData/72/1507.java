package <missing>;

public class GlobalMembers
{
	/*
	 * ????
	 * Created on: 2013-1-13
	 * ??
	 * Author: ???
	 */
	public static int Main()
	{
		int r = 0;
		int c = 0;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] mountain = new int[r + 2][c + 2];
		for (int i = 0; i < r + 2; i++)
		{
			for (int j = 0; j < c + 2; j++)
			{
				if (i == 0 || j == 0 || i == r + 1 || j == c + 1)
				{
					mountain[i][j] = 0;
				}
				else
				{
					mountain[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (int i = 1; i < r + 1; i++)
		{
			for (int j = 1; j < c + 1; j++)
			{
				if ((mountain[i][j] >= mountain[i - 1][j]) && (mountain[i][j] >= mountain[i + 1][j]) && (mountain[i][j] >= mountain[i][j - 1]) && (mountain[i][j] >= mountain[i][j + 1]))
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

