package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int r;
		int c;
		int i;
		int j;
		int times;
		int x;
		int y;
		int[][] a = new int[120][120];

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

		r = row;
		c = col;
		times = 0;
		x = 1;
		y = 0;
		while (times < r * c)
		{
			if (col != 0)
			{
				for (i = 1;i <= col;i++)
				{
					System.out.printf("%d\n",a[x][y + i]);
					times++;
				}
				y += col;
				row--;
				if (times == r * c)
				{
					  col = row = 0;
				}
			}
			if (row != 0)
			{
				for (i = 1;i <= row;i++)
				{
					System.out.printf("%d\n",a[x + i][y]);
					times++;

				}
				x += row;
				col--;
				if (times == r * c)
				{
					  col = row = 0;
				}
			}
			if (col != 0)
			{
				for (i = 1;i <= col;i++)
				{
					System.out.printf("%d\n",a[x][y - i]);
					times++;

				}
				y -= col;
				row--;
				if (times == r * c)
				{
					  col = row = 0;
				}
			}
			if (row != 0)
			{
				for (i = 1;i <= row;i++)
				{
					System.out.printf("%d\n",a[x - i][y]);
					times++;
				}
				x -= row;
				col--;
				if (times == r * c)
				{
					  col = row = 0;
				}
			}
		}

		return 0;
	}

}

