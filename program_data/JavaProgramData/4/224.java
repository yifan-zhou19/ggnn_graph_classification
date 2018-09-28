package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int row;
	int col;
	int i;
	int j;
	int n;
	int[][] array = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		col = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < row;i++)
	{
		for (j = 0;j < col;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				array[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (n = 0;n < col;n++)
	{
		for (i = 0;i < n + 1 && i < row;i++)
		{
			j = n - i;
			System.out.printf("%d\n", array[i][j]);
		}
	}
	for (n = col;n < col + row - 1;n++)
	{
		for (i = n - col + 1;i < row && i < n + 1;i++)
		{
			j = n - i;
			System.out.printf("%d\n", array[i][j]);
		}
	}
	}

}

