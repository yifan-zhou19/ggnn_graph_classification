package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double x;
		double y;
		double[] a = new double[100];
		double[] b = new double[100];
		double e;
		double c;
		double[] xl = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Double.parseDouble(tempVar3);
		}
		e = y / x;
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Double.parseDouble(tempVar5);
			}
			xl[i] = b[i] / a[i];
		}
		for (int k = 0;k < n - 1;k++)
		{
			c = xl[k] - e;
			if (c > 0.05)
			{
				System.out.print("better\n");
			}
			if (c < -0.05)
			{
				System.out.print("worse\n");
			}
			if (-0.05 <= c != 0 && c <= 0.05)
			{
				System.out.print("same\n");
			}
		}


		return 0;
	}
}

