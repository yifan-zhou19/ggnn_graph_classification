package <missing>;

public class GlobalMembers
{
	public static double juli(double a1, double b1, double a2, double b2)
	{
		double d;
		d = Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2));
		return (d);
	}
	public static void Main()
	{
		double[] a = new double[20];
		double[] b = new double[20];
		int m;
		int i;
		int j;
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
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
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (juli(a[i], b[i], a[j], b[j]) >= d)
				{
					d = juli(a[i], b[i], a[j], b[j]);
				}
			}
		}
				System.out.printf("%.4lf\n",d);
	}


}

