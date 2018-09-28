package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int column;
	int[][] a = new int[110][110];
	int i;
	int j;
	int row1 = 0;
	int column1 = 0;
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	column = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < row;i++)
	{
	for (j = 0;j < column;j++)
	{
		*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
	}
	}
	for (i = 0;i < (row + column - 1);i++)
	{
		if (i < column)
		{
		column1 = i;
		}
		else
		{
			column1 = column - 1;
		}
	while (column1 >= 0)
	{
		if ((i - column1) < row)
		{
			System.out.print((*(a + i - column1) + column1));
			System.out.print("\n");
		column1--;
		}
		else
		{
			break;
		}
	}
	}
	return 0;
	}
}

