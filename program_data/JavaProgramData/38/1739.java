package <missing>;

public class GlobalMembers
{
	public static double equal(double[] a, int n)
	{
		double x = 0.0;
		int i;
		for (i = 0;i < n;i++)
		{
			x += a[i];
		}
		x = x / n;
		return x;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double s;
		double[] a = new double[1000];
		double x;
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
			}
			x = equal(a, m);
			s = 0.0;
			for (j = 0;j < m;j++)
			{
				s += (a[j] - x) * (a[j] - x);
			}
			s = s / m;
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}
	}
}

