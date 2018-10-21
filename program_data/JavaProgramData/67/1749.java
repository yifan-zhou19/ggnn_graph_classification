package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double x;
		double y;
		double[][] sz = new double[20][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		x = sz[0][1] / sz[0][0];
		for (i = 1;i < n;i++)
		{
			y = sz[i][1] / sz[i][0];
			if (y - x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x - y > 0.05)
			{
				System.out.print("worse\n");
			}
			else if (x - y <= 0.05 || y - x >= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

