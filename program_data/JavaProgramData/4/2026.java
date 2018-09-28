package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row = 0;
		int col = 0;
		int[][] array = new int[100][100];
		int i = 0;
		int j = 0;
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
		for (i = 0;i < col;i++)
		{
			j = 0;
			while (j <= i != 0 && j < row)
			{
				System.out.printf("%d\n",array[j][i - j]);
				j++;
			}
		}
		for (i = 1;i < row;i++)
		{
			j = 0;
			while (j <= row - i - 1 && j < col)
			{
				System.out.printf("%d\n",array[i + j][col - 1 - j]);
				j++;
			}
		}
	}
}

