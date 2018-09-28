package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		int i;
		int j;
		int k;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}


		for (i = 0;i < col + row - 1;i++) //?????
		{
			for (j = i, k = 0;(j >= 0) && (k < row);j--, k++) //?????????????????????0???????i?????????????1????1???????0????????
			{
				if (j < col) //????
				{
					System.out.print(array[k][j]);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

