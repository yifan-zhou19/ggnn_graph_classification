package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] data = new int[100][100];
	//??????
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				data[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	//?????
		for (int i = 0; i < col; i++)
		{ //?????????????
			int m = 0;
			int n = i;
			while (true)
			{
				System.out.print(data[m][n]);
				System.out.print("\n");
				m++;
				n--;
				if (m == row || n == -1) //?????????
				{
					break;
				}
			}
		}
		for (int i = 1; i < row; i++)
		{ //??????????????
			int m = i;
			int n = col - 1;
			while (true)
			{
				System.out.print(data[m][n]);
				System.out.print("\n");
				m++;
				n--;
				if (m == row || n == -1) //?????????
				{
					break;
				}
			}
		}
		return 0;
	}

}

