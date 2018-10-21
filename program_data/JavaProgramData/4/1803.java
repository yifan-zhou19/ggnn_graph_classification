package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
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

		for (k = 0;k < col;k++)
		{
			for (i = 0;k - i >= 0 && i <= row - 1;i++)
			{
				System.out.printf("%d\n",a[0 + i][k - i]);
			}
		}
		for (k = 1;k < row;k++)
		{
			for (i = 0;k + i <= row - 1 && col - 1 - i >= 0;i++)
			{
				System.out.printf("%d\n",a[k + i][col - 1 - i]);
			}
		}
	}
}

