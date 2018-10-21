package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int COL;
		int ROW;
		int[][] n = new int[8][8];
		int max;
		int min;
		int a = 0;
		int geshu = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (row = 0;row < ROW;row++)
		{
			max = 0;
			for (col = 0;col < COL;col++)
			{
				if (n[row][col] > max)
				{
					max = n[row][col];
					a = col; //??????????????a?
				}
			}
			min = n[row][a];
			for (row = 0;row < ROW;row++)
			{
				if (n[row][a] < min)
				{
					min = n[row][a];
					b = row; //??????????????????b?
				}
			}
			if (max != min)
			{
				continue;
			}
			else
			{
				System.out.printf("%d+%d",b,a);
				geshu += 1;
				break; //????????????
			}
		}
		if (geshu == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

