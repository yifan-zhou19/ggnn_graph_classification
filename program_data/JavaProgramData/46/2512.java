package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100]; //??????array
		int row; //?????
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++) //????
		{
			for (int j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int startrow = 0; //??????????
		int startcol = 0;
		int sum = 0; //???????????
		while (true) //?????????????
		{
			for (int i = startcol; i < col - startcol; i++)
			{
				System.out.print(array[startrow][i]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (int i = startrow + 1; i < row - startrow; i++)
			{
				System.out.print(array[i][col - startcol - 1]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (int i = col - startcol - 2; i > startcol; i--)
			{
				System.out.print(array[row - startrow - 1][i]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			for (int i = row - startrow - 1; i > startrow; i--)
			{
				System.out.print(array[i][startcol]);
				System.out.print("\n");
				sum++;
			}
			if (sum == row * col)
			{
				break;
			}
			startrow++; //????????????????
			startcol++;
		}
		return 0;
	}
}

