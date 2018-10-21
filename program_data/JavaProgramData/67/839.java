package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		double z = y * 1.0 / x;
		double[] sz = new double[100];
		int[] zong = new int[100];
		int[] xiao = new int[100];
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zong[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				xiao[i] = Integer.parseInt(tempVar5);
			}
			sz[i] = xiao[i] * 1.0 / zong[i];
		}
		for (i = 0;i < n - 2;i++)
		{
			if (sz[i] - z > 0.05)
			{
				System.out.print("better\n");
			}
			else if (z - sz[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		if (sz[i] - z > 0.05)
		{
				System.out.print("better");
		}
			else if (z - sz[i] > 0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}

		return 0;
	}

}

