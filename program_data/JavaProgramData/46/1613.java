package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int row;
	int col;
	row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] shuzu = new int[100][100];
	int p = 0;
	int q = 0;
	int count = 0;
	for (p = 0;p < row;p++)
	{
		for (q = 0;q < col;q++)
		{
		shuzu[p][q] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	for (;row - count > 0 && col - count > 0;)
	{
	p = count;
	for (q = count;q < col;q++)
	{
		System.out.print(shuzu[p][q]);
		System.out.print("\n");
	}
	if (row == count + 1)
	{
		return 0;
	}
	q = col - 1;
	for (p = count + 1;p < row;p++)
	{
		System.out.print(shuzu[p][q]);
		System.out.print("\n");
	}
	if (col == 1 + count)
	{
		return 0;
	}
	p = row - 1;
	for (q = col - 2;q >= count;q--)
	{
		System.out.print(shuzu[p][q]);
		System.out.print("\n");
	}
	q = count;
	for (p = row - 2;p > count;p--)
	{
		System.out.print(shuzu[p][q]);
		System.out.print("\n");
	}
	row--;
	col--;
	count++;
	}
	return 0;
	}
}

