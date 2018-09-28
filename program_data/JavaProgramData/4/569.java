package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int s;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[100][100];
		for (i = 0;i < row;i++) //?????
		{
			for (j = 0;j < col;j++)
			{
			array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < col;i++) //????????
		{
				s = i;
			 while (s >= 0 && (i - s) < row)
			 {
				   System.out.print(array[i - s][s]);
				   System.out.print("\n");
			   s--;
			 }
		}
			 for (i = col;i < col + row - 1;i++) //????????
			 {
						   s = col - 1;
				 while (s >= 0 && (i - s) < row)
				 {
					   System.out.print(array[i - s][s]);
					   System.out.print("\n");
				   s--;
				 }
			 }

		return 0;
	}

}

