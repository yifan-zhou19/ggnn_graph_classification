package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int a;
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
		k = row + col;
		for (a = 0;a < k - 1;a++)
		{
			for (i = 0;i <= a;i++)
			{
				if (i < row && (a - i) < col)
				{
					System.out.printf("%d\n",array[i][a - i]);
				}
				else if (i >= row)
				{
					i++;
				}
			}
		}
		return 0;
	}

}

