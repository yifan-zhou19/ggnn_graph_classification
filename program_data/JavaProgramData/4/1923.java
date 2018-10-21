package <missing>;

public class GlobalMembers
{
	//*************************
	//????:????
	//?? ? ?? ??;1300012814
	//**************************
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
		for (int j = 0; j < col; j++)
		{
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (int i = 0; i <= row + col - 2; i++)
		{
		for (int j = 0; j < row; j++)
		{
		if (j >= 0 && j < row && i - j >= 0 && i - j < col)
		{
			System.out.print(a[j][i - j]);
			System.out.print("\n");
		}
		else
		{
			continue;
		}
		}
		}

		return 0;
	}
}

