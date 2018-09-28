package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] array = new int[100][100];
		int point = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < col;j++)
		{
			point = j;
			i = 0;
			do
			{
				System.out.print(array[i++][point--]);
				System.out.print("\n");
			} while (point >= 0 && i < row);
		}
		for (i = 1;i < row;i++)
		{
			point = i;
			j = col - 1;
			do
			{
				System.out.print(array[point++][j--]);
				System.out.print("\n");
			} while (point < row && j >= 0);
		}
		return 0;
	}
}

