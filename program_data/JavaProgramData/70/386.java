package <missing>;

public class GlobalMembers
{
	public static double distance(double a,double b,double c,double d)
	{
		double t;
		t = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
		return (t);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[10];
		double[] b = new double[10];
		double max;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
		max = distance(a[0], b[0], a[1], b[1]);
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 1;j <= n - 1;j++)
			{
				h = distance(a[i], b[i], a[j], b[j]);
				if (h > max)
				{
					max = h;
				}
			}
		}
		System.out.printf("%.4f\n",max);
	}

}

