package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double A;
		double B;
		double C;
		double D;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a >= 1 && a <= 18)
		{
		b += 1;
		}
		else if (a >= 19 && a <= 35)
		{
		c += 1;
		}
		else if (a >= 36 && a <= 60)
		{
			d += 1;
		}
		else if (a >= 61)
		{
		e += 1;
		}
		}
		A = 1.0 * b / n;
		B = 1.0 * c / n;
		C = 1.0 * d / n;
		D = 1.0 * e / n;
		System.out.printf("1-18: %.2lf%%\n",A * 100);
		System.out.printf("19-35: %.2lf%%\n",B * 100);
		System.out.printf("36-60: %.2lf%%\n",C * 100);
		System.out.printf("60??: %.2lf%%\n",D * 100);
		return 0;
	}
}

