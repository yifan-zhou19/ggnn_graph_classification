package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[NUM][COL];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < COL;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		double rate;
		rate = (double)a[0][1] / a[0][0];
		for (i = 1;i < n;i++)
		{
			if ((double)a[i][1] / a[i][0] - rate > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((double)a[i][1] / a[i][0] - rate < -0.05)
			{
				System.out.print("worse\n");
			}
			else if ((double)a[i][1] / a[i][0] - rate <= 0.05 && (double)a[i][1] / a[i][0] - rate >= -0.05)
			{
				System.out.print("same\n");
			}
		}
		 return 0;

	}
}

