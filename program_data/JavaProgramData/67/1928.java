package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] zong = new int[N];
		int[] xiao = new int[N];
		int k;
		double x;
		double[] y = new double[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zong[k] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				xiao[k] = Integer.parseInt(tempVar3);
			}
		}
		x = 1.0 * xiao[0] / zong[0];
		for (k = 1;k < n;k++)
		{
			y[k] = 1.0 * xiao[k] / zong[k];
			if (y[k] - x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x - y[k] > 0.05)
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

