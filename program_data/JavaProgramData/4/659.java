package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int max;
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
		int i;
		int j;
		int[][] a = new int[101][101];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= row + col - 2;i++)
		{
				max = 0;
				if (row - 1 < i)
				{
					max = row - 1;
				}
				else
				{
					max = i;
				}
			for (j = 0;j <= max;j++)
			{
				if (i - j <= col - 1)
				{
						System.out.printf("%d\n",a[j][i - j]);
				}
			}
		}
	}
}

