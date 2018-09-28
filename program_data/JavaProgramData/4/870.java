package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix = new int[99][99];
		int row;
		int column;
		int startcolumn = 0;
		int startrow = 1;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		column = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x = 0;
		int y;
		do
		{
			y = startcolumn;
			while (x < row && y >= 0)
			{
				  System.out.print(matrix[x][y]);
				  System.out.print("\n");
				  x++;
				  y--;
			}
			x = 0;
			startcolumn++;
		} while (startcolumn < column);
		int m;
		int n = column - 1;
		do
		{
			m = startrow;
			while (m < row && n >= 0)
			{
				  System.out.print(matrix[m][n]);
				  System.out.print("\n");
				  m++;
				  n--;
			}
			startrow++;
			n = column - 1;
		} while (startrow < row);

		return 0;
	}


}

