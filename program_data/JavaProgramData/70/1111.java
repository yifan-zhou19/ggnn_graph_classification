package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] d = new double[100];
		double max = 0;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (e = 0;e < i;e++)
			{
				d[e] = (a[i] - a[e]) * (a[i] - a[e]) + (b[i] - b[e]) * (b[i] - b[e]);
				if (d[e] > max)
				{
					max = d[e];
				}
			}
		}
		System.out.printf("%.4lf",Math.sqrt(max));
		return 0;
	}
}

