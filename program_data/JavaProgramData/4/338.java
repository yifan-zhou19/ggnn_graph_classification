package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num = 0;
		int i;
		int j;
		int row;
		int col;
		int[][] a = new int[105][105];
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			for (h = 0;h < col + row - 1;h++)
			{
				if (h < col)
				{
				for (i = 0;i < row && h - i >= 0 && h - i < col;i++)
				{
					j = h - i;
					System.out.printf("%d\n",a[i][j]);
				}
				}
			else
			{
			for (j = col - 1;j >= 0 && h - j >= 0 && h - j < row;j--)
			{
				i = h - j;
				System.out.printf("%d\n",a[i][j]);
			}
			}
			}

	}
}

