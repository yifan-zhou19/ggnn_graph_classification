package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] array = new int[110][110];
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
		System.in.read();
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= col + row - 2;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (j >= row != 0 || (i - j) >= col)
				{
					continue;
				}
				System.out.printf("%d\n", array[j][i - j]);
			}
		}
		return 0;
	}
}

