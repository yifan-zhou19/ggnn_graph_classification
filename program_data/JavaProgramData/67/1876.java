package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] sz = new int[100][100];
		int j;
		double a;
		double b;
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
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		a = 1.0 * sz[0][1] / sz[0][0];
		for (i = 1;i < n;i++)
		{
		b = 1.0 * sz[i][1] / sz[i][0] - a;
		if (b > 0.05)
		{
			System.out.print("better\n");
		}
		if (b < -0.05)
		{
			System.out.print("worse\n");
		}
		if (b < 0.05 && b>-0.05)
		{
			System.out.print("same\n");
		}
		}
	return 0;
	}
}

