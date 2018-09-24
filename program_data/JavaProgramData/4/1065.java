package <missing>;

public class GlobalMembers
{
	//********************************
	//*?? ?????????? *****
	//*????? 1300012753     ***** 
	//*???2013.11.01          *****   
	//********************************
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int sum = 0; sum <= row + col - 2; sum++)
		{
			for (int i = 0; i <= sum; i++)
			{
				if (i > row - 1)
				{
				break;
				}
				for (int j = 0; j <= sum; j++)
				{
					if (j > col - 1)
					{
					break;
					}
					if (i + j == sum)
					{
					System.out.print(a[i][j]);
					System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

