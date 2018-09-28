package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i; //????
	   int j;
	   int k;
	   int row;
	   int col;
	   int[][] array = new int[100][100];
	   row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < row;i++) //????
	   {
		for (j = 0;j < col;j++)
		{
			array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	   }
		 for (k = 0;k <= col + row - 2;k++) //????
		 {
			for (i = 0;i <= k;i++)
			{
				j = k - i;
				if (i < row && j >= 0 && j < col)
				{
					System.out.print(array[i][j]);
					System.out.print("\n");
				}
			}
		 }
		return 0;
	}
}

