package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		int[] b = new int[10000];
		double s;
		double m;
		double q;
		double[] c = new double[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		s = b[0] * 1.0 / a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
		}
		for (i = 1;i < n;i++)
		{
			c[i] = b[i] * 1.0 / a[i];
			m = s - c[i];
			q = c[i] - s;
			if (m > 0.05)
			{
				System.out.print("worse\n");
			}
			if (q > 0.05)
			{
				System.out.print("better\n");
			}
			if (m <= 0.05 && q <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

