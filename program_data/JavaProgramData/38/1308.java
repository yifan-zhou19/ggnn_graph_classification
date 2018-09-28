package <missing>;

public class GlobalMembers
{
	public static double ver(double[] a, int n)
	{
		double sum = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}
		return sum / n;
	}
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double[] x = new double[M];
		double a;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (p = x;p < n + x;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
			a = ver(x, n);
			p = x,s = 0;
			for (i = 0;i < n;i++)
			{
				s += (x[i] - a) * (x[i] - a);
			}
			System.out.printf("%.5f\n",Math.sqrt(s / n));

		}
	}
}

