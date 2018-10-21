package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[100];
	int n;
	int i;
	int a;
	int b;
	int c;
	int d;
	double w;
	double x;
	double y;
	double z;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	a = 0;
	b = 0;
	c = 0;
	d = 0;

	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar2);
		}
	if (sz[i] <= 18)
	{
		a++;
	}
	else
	{
	if (sz[i] <= 35)
	{
		b++;
	}
	else
	{
	if (sz[i] <= 60)
	{
		c++;
	}
	else
	{
		d++;
	}
	}
	}
	}
	w = a * 1.0 / n * 100;
	x = b * 1.0 / n * 100.0;
	y = c * 1.0 / n * 100.0;
	z = d * 1.0 / n * 100.0;
	System.out.printf("1-18: %.2lf%\n",w);
	System.out.printf("19-35: %.2lf%\n",x);
	System.out.printf("36-60: %.2lf%\n",y);
	System.out.printf("60??: %.2lf%\n",z);
	return 0;
	}
}

