package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[][] a = new int[101][101];
		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 1;i <= row / 2 && i <= col / 2;i++)
		{
			  for (int j = i;j <= col - i;j++)
			  {
				  System.out.printf("%d", a[i][j]);
				  System.out.printf("%d", "\n");
			  }
			  for (int j = i;j <= row - i;j++)
			  {
				  System.out.printf("%d", a[j][col - i + 1]);
				  System.out.printf("%d", "\n");
			  }
			  for (int j = col - i + 1;j >= i + 1;j--)
			  {
				  System.out.printf("%d", a[row - i + 1][j]);
				  System.out.printf("%d", "\n");
			  }
			  for (int j = row - i + 1;j >= i + 1;j--)
			  {
				  System.out.printf("%d", a[j][i]);
				  System.out.printf("%d", "\n");
			  }
		}

		if (row % 2 == 1 && row <= col)
		{
			for (int j = row / 2 + 1;j <= col - row / 2;j++)
			{
				System.out.printf("%d", a[row / 2 + 1][j]);
				System.out.printf("%d", "\n");
			}
		}
		if (col % 2 == 1 && row > col)
		{
			for (int j = col / 2 + 1;j <= row - col / 2;j++)
			{
				System.out.printf("%d", a[j][col / 2 + 1]);
				System.out.printf("%d", "\n");
			}
		}


		return 0;
	}


}

