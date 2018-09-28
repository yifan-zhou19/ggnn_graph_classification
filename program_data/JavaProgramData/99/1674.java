package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double e;
		double f;
		double g;
		double h;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a >= 1 && a <= 18)
			{
				A += 1;
			}
			if (a >= 19 && a <= 35)
			{
				B += 1;
			}
			if (a >= 36 && a <= 60)
			{
				C += 1;
			}
			if (a >= 61)
			{
				D += 1;
			}
		}
		//printf("%lf %lf %lf %lf",A,B,C,D);
		e = A / n * 100;
		f = B / n * 100;
		g = C / n * 100;
		h = D / n * 100;
		System.out.printf("1-18: %.2lf%%\n",e);
		System.out.printf("19-35: %.2lf%%\n",f);
		System.out.printf("36-60: %.2lf%%\n",g);
		System.out.printf("60??: %.2lf%%",h);
	return 0;
	}
}

