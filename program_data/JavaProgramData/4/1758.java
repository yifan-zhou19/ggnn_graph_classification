package <missing>;

public class GlobalMembers
{
	//??????????


	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++) //????
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int p = 0;p <= row + col - 2;p++) //????????? ??
		{
			for (int i = 0;i <= p;i++)
			{
				int j = p - i;
				if (i > row - 1 || j > col - 1 || j < 0)
				{
					continue;
				}
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

