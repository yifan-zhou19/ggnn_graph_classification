package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] b = new int[n];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(b[i]) = Integer.parseInt(tempVar2);
	}
	}
	double a;
	double c;
	double d;
	double e;
	double f;
	double g;
	double h;
	double j;
	a = 0;
	c = 0;
	d = 0;
	e = 0;
	for (i = 0;i < n;i++)
	{
		if (b[i] > 0 && b[i] <= 18)
		{
			a++;
		}
		else if (b[i] >= 19 && b[i] <= 35)
		{
			c++;
		}
		else if (b[i] >= 36 && b[i] <= 60)
		{
			d++;
		}
		else if (b[i] >= 61 && b[i] <= 100)
		{
			e++;
		}
	}
	f = 100 * a / n;
	g = 100 * c / n;
	h = 100 * d / n;
	j = 100 * e / n;
	System.out.print("1-18: ");
	System.out.printf("%.2lf",f);
	System.out.print("%%\n");
	System.out.print("19-35: ");
	System.out.printf("%.2lf",g);
	System.out.print("%%\n");
	System.out.print("36-60: ");
	System.out.printf("%.2lf",h);
	System.out.print("%%\n");
	System.out.print("Over60: ");
	System.out.printf("%.2lf",j);
	System.out.print("%%");



	return 0;

	}
}

