package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n;
	double[] x = new double[4];
	int i;
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m > 60)
		{
			d = d + 1;
		}
		else if (m < 19)
		{
			a = a + 1;
		}
		else if (m >= 19 && m <= 35)
		{
			b = b + 1;
		}
		else if (m <= 60 && m >= 36)
		{
			c = c + 1;
		}
	}
	x[0] = 100 * (a / n);
	x[1] = 100 * (b / n);
	x[2] = 100 * (c / n);
	x[3] = 100 * (d / n);
	System.out.printf("1-18: %.2lf%%\n",x[0]);
	System.out.printf("19-35: %.2lf%%\n",x[1]);
	System.out.printf("36-60: %.2lf%%\n",x[2]);
	System.out.printf("60??: %.2lf%%\n",x[3]);
	return 0;
	}
}

