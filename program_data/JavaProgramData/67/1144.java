package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int p;
		int q;
		double m;
		double[] c = new double[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		m = 1.0 * q / p;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			c[i] = 1.0 * b / a;

		}
		for (i = 0;i < n - 1;i++)
		{
			if ((c[i] - m) > 0.050)
			{
				System.out.print("better\n");
			}
			if ((m - c[i]) > 0.050)
			{
				System.out.print("worse\n");
			}
			if (((c[i] - m) <= 0.050) && ((c[i] - m) >= -0.050))
			{
				System.out.print("same\n");
			}

		}
		return 0;
	}
}

