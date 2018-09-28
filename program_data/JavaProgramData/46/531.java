package <missing>;

public class GlobalMembers
{
	public static int x;
	public static int y;
	public static int x1;
	public static int y1;
	public static void next()
	{
		if ((x1 == 0) && (y1 == 1))
		{
			x1 = 1;
			y1 = 0;
		}
		else if ((x1 == 1) && (y1 == 0))
		{
			x1 = 0;
			y1 = -1;
		}
		else if ((x1 == 0) && (y1 == -1))
		{
			x1 = -1;
			y1 = 0;
		}
		else if ((x1 == -1) && (y1 == 0))
		{
			x1 = 0;
			y1 = 1;
		}
	}
	public static void Main()
	{
		int[][] a = new int[200][200];
		int row;
		int col;
		int i;
		int j;
		int count;
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		x1 = 0;
		y1 = 1;
		for (x = 1,y = 0,count = 1;count <= row * col;)
		{
			x = x + x1;
			y = y + y1;
			if (a[x][y] == 0)
			{
				x = x - x1;
				y = y - y1;
				next();
			}
			else
			{
				System.out.printf("%d\n",a[x][y]);
				a[x][y] = 0;
				count++;
			}
		}
	}
}

