package <missing>;

public class GlobalMembers
{
	//*******************************
	// ???? ??????????
	// ?? ? ??? 1300012972
	// ?? ? 2013.11.6
	//*******************************



	public static int Main()
	{
		int step = 0;
		int row;
		int col;
		int[] x = {0, 1, 0, -1};
		int[] y = {1, 0, -1, 0};
		int[][] array = new int[100][100];
		int i;
		int j;
		int[][] acc = new int[100][100];
		int d = 0;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		i = 0;
		j = -1;

		while (step < row * col)
		{
			i += x[d];
			j += y[d];

			if (i >= 0 && i < row && j >= 0 && j < col && acc[i][j] == 0)
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				acc[i][j] = 1;
				step++;
			}
			else
			{
				i -= x[d];
				j -= y[d];
				d = (d + 1) % 4;
			}
		}

		return 0;
	}

}

