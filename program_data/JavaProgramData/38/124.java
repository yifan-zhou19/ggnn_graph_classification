package <missing>;

public class GlobalMembers
{
	public static void f(tangible.RefObject<Double> p, double n)
	{
		int i;
		double ave = 0;
		double s = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.argValue + i = Double.parseDouble(tempVar);
			}
			ave = ave + *(p.argValue + i);
		}
		ave = ave / n;
		for (i = 0;i <= n - 1;i++)
		{
			s = s + Math.pow((*(p.argValue + i) - ave),2);
		}
		s = Math.sqrt(s / n);
		System.out.printf("%.5lf\n",s);
	}
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int j;
		for (j = 1;j <= k;j++)
		{
			double[] a = new double[102];
			double[] p = a;
			double n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Double.parseDouble(tempVar2);
			}
		tangible.RefObject<Double> tempRef_p = new tangible.RefObject<Double>(p);
			f(tempRef_p, n);
			p = tempRef_p.argValue;
		}
		return 0;
	}
}

