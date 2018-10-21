package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i;
	double a;
	double b;
	double c;
	for (i = 0;i < m;i += 1)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int j;
		double s = 0;
		a = 2;
		b = 1;
		for (j = 1;j <= n;j += 1)
		{
			s += a / b;
			c = a;
		 a = a + b;
		b = c;
		}

	System.out.printf("%.3lf\n",s);
	}
	return 0;
	}
}

