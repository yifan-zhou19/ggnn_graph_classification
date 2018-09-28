package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[10000][2];
		double x;
		double y;
		int i;
		int j;
		int row;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		x = (double)sz[0][1] / (double)sz[0][0];
		for (i = 1;i < row;i++)
		{
			y = (double)sz[i][1] / (double)sz[i][0];
			if (y - x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

