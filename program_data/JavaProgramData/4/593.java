package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < col; i++)
		{
			k = i;
			j = 0;
			while ((k >= 0) && (j <= row - 1))
			{
				System.out.print(array[j][k]);
				System.out.print('\n');
				k--;
				j++;
			}
		}
		for (i = 1; i < row; i++)
		{
			k = i;
			j = col - 1;
			while ((k <= row - 1) && (j >= 0))
			{
				System.out.print(array[k][j]);
				System.out.print('\n');
				k++;
				j--;
			}
		}
		return 0;
	}


}

