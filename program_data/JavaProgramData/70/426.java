package <missing>;

public class GlobalMembers
{
	public static double distance(double a,double b,double c,double d)
	{
		double q;
		q = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
		return (q);
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		double[] a = new double[100];
		double[] b = new double[100];
		double d;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
		}
		d = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (d < distance(a[i], b[i], a[j], b[j]))
				{
					d = distance(a[i], b[i], a[j], b[j]);
				}
			}
		}
		System.out.printf("%.4f",d);
	}
}

