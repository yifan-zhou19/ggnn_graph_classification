package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[100][100];
	for (int i = 0;i < row;i++)
	{
	for (int j = 0;j < col;j++)
	{
	*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
	}
	}
	for (int i = 0;i < col;i++)
	{
	for (int j = 0;j < row && j <= i;j++)
	{
	System.out.print((*(a + j) + i - j));
	System.out.print("\n");
	}
	}
	for (int i = 1;i < row;i++)
	{
	for (int j = 0;col - 1 - j >= 0 && i + j < row;j++)
	{
	System.out.print((*(a + i + j) + col - 1 - j));
	System.out.print("\n");
	}
	}
		return 0;
	}
}

