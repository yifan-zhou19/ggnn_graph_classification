package <missing>;

public class GlobalMembers
{
	public static double Q(int x)
	{
		double a = 1.0;
		double b = 2.0;
		double k;
		double i;
		double s = 0;
		for (i = 1;i <= x;i++)
		{
		s += b / a;
		k = a + b;
		a = b;
		b = k;
		}
		return s;
	}
	public static int Main()
	{
	int m;
	int[] p = new int[100];
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i <= m;i++)
	{
	System.out.printf("%.3lf\n",Q(p[i]));
	}
	return 0;
	}
}

