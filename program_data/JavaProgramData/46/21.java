package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int i;
		int j;
		int[][] b =
		{
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int col;
		int row;
		int x = 0;
		int y = 0;
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
		for (i = 0;i < row;++i)
		{
			for (j = 0;j < col;++j)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] + j = Integer.parseInt(tempVar3);
				}
			}
		}
		System.out.printf("%d\n",a[0][0]);
		while (true)
		{
			if (b[x][++y] != 0)
			{
				break;
			}
			while ((b[x][y] == 0) && (y < col))
			{
				System.out.printf("%d\n",a[x][y]);
				b[x][y] = 1;
				++y;
			}
			--y;
			if (b[++x][y] != 0)
			{
				break;
			}
			while ((b[x][y] == 0) && (x < row))
			{
				System.out.printf("%d\n",a[x][y]);
				b[x][y] = 1;
				++x;
			}
			--x;
			if (b[x][--y] != 0)
			{
				break;
			}
			while ((b[x][y] == 0) && (y >= 0))
			{
				System.out.printf("%d\n",a[x][y]);
				b[x][y] = 1;
				--y;
			}
			++y;
			if (b[--x][y] != 0)
			{
				break;
			}
			while ((b[x][y] == 0) && (x >= 0))
			{
				System.out.printf("%d\n",a[x][y]);
				b[x][y] = 1;
				--x;
			}
			++x;
		}
		return 0;
	}


}

