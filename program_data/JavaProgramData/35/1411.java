package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int row;
		int col;
		int i;
		int j;
		int x;
		int y;
		int max;
		int b;
		int m;
		b = 0;
		m = 0;
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
		for (i = 0;i < row;i++)
		{
			max = a[i][0];
			y = 0;
			x = i;
			for (j = 1;j < col;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					y = j;
				}
			}
			for (j = y,i = 0;i < row;i++)
			{
				if (max > a[i][j])
				{
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.printf("%d+%d",x,y);
				b = 1;
			}
		}
		if (b != 1)
		{
			System.out.print("No");
		}
		return 0;
	}

}

