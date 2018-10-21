package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[][] a = new int[100][100];
		int row;
		int col;
		int[] b = new int[10];
		int[] c = new int[10];
		int[] d = new int[10];
		int[] e = new int[10];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (x = 0;x < row;x++)
		{
			for (y = 0;y < col;y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[x][y] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (x = 0;x < row;x++)
		{
			for (y = 0;y < col;y++)
			{
				if (y == 0)
				{
					b[x] = a[x][y];
					c[x] = x;
				}
				else if (a[x][y] > b[x])
				{
					b[x] = a[x][y];
					c[x] = x;
				}
			}
		}
		for (y = 0;y < col;y++)
		{
			for (x = 0;x < row;x++)
			{
			if (x == 0)
			{
				d[y] = a[x][y];
				e[y] = y;
			}
			else if (a[x][y] < d[y])
			{
					d[y] = a[x][y];
					e[y] = y;
			}
			}
		}
		for (x = 0;x < row;x++)
		{
			for (y = 0;y < col;y++)
			{
				if (b[x] == d[y])
				{
					i = 1;
					System.out.printf("%d+%d",c[x],e[y]);
				}
			}
		}
			if (i == 0)
			{
				System.out.print("No");
			}
			return 0;
	}
}

