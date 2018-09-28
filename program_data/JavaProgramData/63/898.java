package <missing>;

public class GlobalMembers
{
	/********************************************************************
		file base:	main
		file ext:	cpp
		author:		cromwell
		
		purpose:	matrix multiplication
	*********************************************************************/


	public static int Main()
	{
		int[] x = new int[2];
		int[] y = new int[2];
		int[][][] Matrix = new int[2][100][100];
		int[][] answer = new int[100][100];
		//input
		for (int i = 1;i <= 2;i++)
		{
			x[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j <= x[i - 1];j++)
			{
				for (int k = 1;k <= y[i - 1];k++)
				{
					Matrix[i - 1][j - 1][k - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

		}
		//multiply

		for (int row = 1;row <= x[0];row++)
		{
			for (int column = 1;column <= y[1];column++)
			{
				answer[row - 1][column - 1] = 0;

				for (int i = 1;i <= y[0];i++)
				{
					answer[row - 1][column - 1] += Matrix[0][row - 1][i - 1] * Matrix[1][i - 1][column - 1];
				}

				if (column == y[1])
				{
					System.out.print(answer[row - 1][column - 1]);
				}
				else
				{
					System.out.print(answer[row - 1][column - 1]);
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}

		return 0;

	}
}

