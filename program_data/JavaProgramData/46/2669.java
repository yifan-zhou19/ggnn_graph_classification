package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
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
		for (i = 0;;i++)
		{
			if (i >= ((row + 1) / 2))
			{
				break;
			}
			if (i >= ((col + 1) / 2))
			{
				break;
			}
			x1 = i;
			x2 = row - i - 1;
			y1 = i;
			y2 = col - i - 1;
			for (y1 = y1;y1 <= y2;y1++)
			{
				System.out.printf("%d\n",a[x1][y1]);
			}
			y1 = i;

			for (x1 = x1 + 1;x1 <= x2;x1++)
			{
				System.out.printf("%d\n",a[x1][y2]);
			}
			x1 = i;
			if (x1 < x2)
			{
			for (y2 = y2 - 1;y2 >= y1;y2--)
			{
				System.out.printf("%d\n",a[x2][y2]);
			}
			}
			y2 = col - 1 - i;
			if (y1 < y2)
			{
			for (x2 = x2 - 1;x2 > x1;x2--)
			{
				System.out.printf("%d\n",a[x2][y1]);
			}
			}

		}
		return 0;
	}


}

