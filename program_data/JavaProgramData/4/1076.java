package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int row;
	int col;
	int i;
	int j;
	int c = 1;
	int[] p = a[0];
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < row;i++)
	{
	for (j = 0;j < col;j++)
	{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	for (i = 0;i < row * col;i++)
	{
	System.out.print(p);
	System.out.print("\n");
	if ((p - a[0]) % 100 == 0 || (p - a[0]) / 100 >= row - 1)
	{
	c++;
	if (c <= col)
	{
		p = a[0] + c - 1;
	}
	else
	{
		p = a[0] + (c - col) * 100 + col - 1;
	}
	}
	else
	{
		p = p + 99;
	}
	}
	return 0;
	}

}

