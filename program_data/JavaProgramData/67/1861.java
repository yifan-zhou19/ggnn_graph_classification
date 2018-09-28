package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int m;
		double x;
		double z;
		double[] y = new double[100];
		double[] sz = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		x = 1.0 * b / a;
		m = 2 * n - 2;
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(sz[i]) = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < m;i = i + 2)
		{
			y[i] = sz[i + 1] / sz[i];
		}
		for (i = 0;i < m;i = i + 2)
		{
			z = y[i] - x;
			if (z > 0.05)
			{
				System.out.print("better\n");
			}
			else if (-z > 0.05)
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

