package <missing>;

public class GlobalMembers
{
	public static double F(int n)
	{
	double a;
	double b;
	double x;
	double i;
	double r;
	a = 0;
	b = 1;
	if (n == 0)
	{
		return 0;
	}
	if (n == 1)
	{
		return 1;
	}
	if (n > 1)
	{
		for (i = 1;i < n;i++)
		{
		x = a;
		a = b;
		r = x + a;
		b = r;
		}
	}
	return r;
	}
	public static int Main()
	{
		int j;
		int i;
		int n;
		int m;
		double result;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
		result = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 3;i < n + 3;i++)
		{
			result += F(i) / F(i - 1);
		}
		System.out.printf("%.3lf\n", result);
		}
		return 0;
	}
}

