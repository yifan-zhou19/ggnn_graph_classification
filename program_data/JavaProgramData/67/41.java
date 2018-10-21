package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] zs = new int[1000];
		int[] yx = new int[1000];
		double x;
		double[] y = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				yx[i] = Integer.parseInt(tempVar3);
			}
			x = 1.0 * 100 * yx[0] / zs[0];
			y[i] = 1.0 * 100 * yx[i] / zs[i];
		}
		for (i = 1;i < n;i++)
		{
			if (y[i] - x > 5.0)
			{
				System.out.print("better\n");
			}
			else if (x - y[i] > 5.0)
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

