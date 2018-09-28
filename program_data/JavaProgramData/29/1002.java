package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	int m;
	int y;
	int[] x = new int[100];
	int b;
	int c;
	int d;
	x[0] = 1;
	x[1] = 2;
	for (y = 2;y < 100;y++)
	{
	   x[y] = x[y - 1] + x[y - 2];
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	a = 2;
	for (b = 0;b < m;b++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (d = 1;d < c;d++)
		{
		a = a + 1.0 * (x[d - 1] + x[d]) / x[d];
		}
		System.out.printf("%.3lf\n",a);
		a = 2;
	}
	return 0;
	}
}

