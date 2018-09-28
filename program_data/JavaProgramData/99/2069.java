package <missing>;

public class GlobalMembers
{
	public static int[] k = new int[100];
	public static int Main()
	{
	int n;
	int i;
	double as;
	double bs;
	double cs;
	double ds;
	double sum;
	as = 0;
	bs = 0;
	cs = 0;
	ds = 0;
	sum = 0;
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
			k[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
	if (k[i] <= 18)
	{
		as++;
	}
	if (k[i] > 18 && k[i] < 36)
	{
		bs++;
	}
	if (k[i] > 35 && k[i] < 61)
	{
		cs++;
	}
	if (k[i] > 60)
	{
		ds++;
	}

	}
	sum = n;

	System.out.printf("1-18: %.2lf%%\n",as * 100.0 / sum);
	System.out.printf("19-35: %.2lf%%\n",bs * 100.0 / sum);
	System.out.printf("36-60: %.2lf%%\n",cs * 100.0 / sum);
	System.out.printf("60??: %.2lf%%\n",ds * 100.0 / sum);

	return 0;

	}
}

