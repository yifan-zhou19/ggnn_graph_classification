package <missing>;

public class GlobalMembers
{
	public static int row;
	public static int col;
	public static int[][] array = new int[8][8];
	public static int ctr1;
	public static int ctr2;
	public static int ctr3;
	public static int ctr4;
	public static int i;
	public static int j = 0;

	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}

	for (ctr1 = 0;ctr1 < row;ctr1++)
	{
	for (ctr2 = 0;ctr2 < col;ctr2++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		array[ctr1][ctr2] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (ctr1 = 0;ctr1 < row;ctr1++)
	{
	for (ctr2 = 0;ctr2 < col;ctr2++)
	{
	i = 0;
	for (ctr3 = 0;ctr3 < col;ctr3++)
	{
		if (array[ctr1][ctr2] > array[ctr1][ctr3])
		{
	i++;
		}
	}
	for (ctr4 = 0;ctr4 < row;ctr4++)
	{
		if (array[ctr4][ctr2] > array[ctr1][ctr2])
		{
	i++;
		}
	}
	if (i == row + col - 2)
	{
		j++;
	System.out.printf("%d+%d",ctr1,ctr2);
	}
	}
	}
	if (j == 0)
	{
	System.out.print("No");
	}
	return 0;
	}
}

