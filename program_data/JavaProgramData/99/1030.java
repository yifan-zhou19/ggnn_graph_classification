package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	double n;
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	double x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Double.parseDouble(tempVar2);
		}
	if (x <= 18)
	{
		a += 1;
	}
	if ((x >= 19) && (x <= 35))
	{
		b += 1;
	}
	if ((x >= 36) && (x <= 60))
	{
		c += 1;
	}
	if (x >= 61)
	{
		d += 1;
	}
	}
	System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%\n",100 * a / n,100 * b / n,100 * c / n,100 * d / n);
	return 0;
	}
}

