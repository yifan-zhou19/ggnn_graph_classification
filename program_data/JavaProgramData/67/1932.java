package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] t = new int[100];
		int[] e = new int[100];
		int total;
		int effect;
		int i;
		double x;
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			total = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			effect = Integer.parseInt(tempVar3);
		}
		x = 100.0 * effect / total;
		for (i = 0;i < (n - 1);i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				t[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e[i] = Integer.parseInt(tempVar5);
			}
			y[i] = 100.0 * e[i] / t[i];
		}
		for (i = 0;i < (n - 1);i++)
		{
			if ((y[i] - x) > 5)
			{
				System.out.print("better\n");
			}
			if ((x - y[i]) > 5)
			{
				System.out.print("worse\n");
			}
			if (((y[i] - x) <= 5) && ((x - y[i]) <= 5))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

