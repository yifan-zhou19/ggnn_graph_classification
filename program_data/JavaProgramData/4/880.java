package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int[][] a = new int[110][110];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (k = 0; k < row + col - 1; k++)
		{
			i = 0;
			j = k;
			while (j >= 0)
			{
				if ((i < row) && (j < col))
				{
					System.out.print((*(a + i) + j));
					System.out.print("\n");
				}
				i++;
				j--;
			}
		}
		return 0; //main???????0
	}
}

