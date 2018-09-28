package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int x;
	double a;
	double b;
	double c;
	double d;
	double e;
	double f;
	double g;
	double h;
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
		x = Integer.parseInt(tempVar2);
	}
	if (x < 19)
	{
		a++;
	}
	else if (x < 36)
	{
		b++;
	}
	else if (x < 61)
	{
		c++;
	}
	else
	{
		d++;
	}
	}
	e = a / n * 100;
	f = b / n * 100;
	g = c / n * 100;
	h = d / n * 100;
	System.out.printf("1-18: %.2lf%%\n",e);
	System.out.printf("19-35: %.2lf%%\n",f);
	System.out.printf("36-60: %.2lf%%\n",g);
	System.out.printf("60??: %.2lf%%\n",h);
	}
}

