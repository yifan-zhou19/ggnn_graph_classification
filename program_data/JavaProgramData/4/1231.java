package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] n = new int[100][100];
		int i;
		int j;
		int k;
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
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0; i <= col + row - 2; i++)
		{
			for (j = 0, k = i; j < row && k >= 0; j++, k--)
			{
				if (k < col)
				{
					System.out.printf("%d\n", n[j][k]);
				}
			}
		}
	}
}

