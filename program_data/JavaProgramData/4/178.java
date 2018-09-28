package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] f = new int[100][100];
		int i;
		int j;
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
					f[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	for (j = 0;j < col;j++)
	{
		for (i = 0;i <= j != 0 && i < row;i++)
		{
			System.out.printf("%d",f[i][j - i]);
			System.out.print("\n");
		}
	}
	for (j = 1;j < row;j++)
	{
		for (i = j;i < row && i <= j + col - 1;i++)
		{
		System.out.printf("%d",f[i][col - 1 + j - i]);
		System.out.print("\n");
		}
	}
	return 0;
	}



}

