package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;

		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (col > row)
		{
		for (k = 0;k <= row - 1;k++)

		{
			i = 0;
			j = k;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j--;
				i++;
			} while (j != -1);
		}
		for (k = row;k < col - 1;k++)
		{
			int s = 0;
			j = k;
			i = 0;
			do
			{
				  System.out.print(array[i][j]);
				  System.out.print("\n");
				  s++;
				  j--;
				  i++;
			} while (s != row);
		}

		for (k = 0;k <= row - 1;k++)
		{
			j = col - 1;
			i = k;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j--;
				i++;
			} while (i != row);
		}
		}
	if (row == col)
	{
		for (k = 0;k <= row - 1;k++)
		{
			i = 0;
			j = k;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j--;
				i++;
			} while (j != -1);
		}
		for (k = 1;k <= row - 1;k++)
		{
			j = col - 1;
			i = k;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j--;
				i++;
			} while (i != row);
		}
	}



	if (col < row)
	{
		for (k = 0;k <= col - 1;k++)

		{
			i = 0;
			j = k;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j--;
				i++;
			} while (j != -1);
		}
		for (k = 1;k < row - col;k++)
		{
			int s = 0;
			j = col - 1;
			i = k;
			do
			{
				  System.out.print(array[i][j]);
				  System.out.print("\n");
				  s++;
				  j--;
				  i++;
			} while (s != col);
		}

		for (k = row - col;k <= row - 1;k++)
		{
			j = col - 1;
			i = k;
			do
			{
				System.out.print(array[i][j]);
				System.out.print("\n");
				j--;
				i++;
			} while (i != row);
		}
	}

		return 0;
	}

}

