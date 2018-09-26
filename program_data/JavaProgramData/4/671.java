package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int x;
		int y;
		int[][] a = new int[100][100];
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
		for (i = 0;i <= col - 1;i++)
		{
			x = 0;
			y = i;
			do
			{
				System.out.printf("%d\n",a[x][y]);
				x++;
				y--;
			} while ((y >= 0) && (x <= row - 1));
		}
		for (i = 1;i <= row - 1;i++)
		{
			x = i;
			y = col - 1;
			do
			{
				System.out.printf("%d\n",a[x][y]);
				x++;
				y--;
			} while ((y >= 0) && (x <= row - 1));
		}




		return 0;
	}
}

