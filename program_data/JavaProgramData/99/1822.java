package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int c;
	int d;
	int[] y = new int[100];
	double e;
	double f;
	double g;
	double h;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
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
		y[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (y[i] >= 1 && y[i] <= 18)
	{
	a++;
	}
	if (y[i] >= 19 && y[i] <= 35)
	{
	b++;
	}
	if (y[i] >= 36 && y[i] <= 60)
	{
	c++;
	}
	else if (y[i] >= 61)
	{
	d++;
	}
	}
	e = (double)100 * a / n;
	f = (double)100 * b / n;
	g = (double)100 * c / n;
	h = (double)100 * d / n;
	System.out.printf("1-18: %.2lf%%\n",e);
	System.out.printf("19-35: %.2lf%%\n",f);
	System.out.printf("36-60: %.2lf%%\n",g);
	System.out.printf("60??: %.2lf%%\n",h);
	return 0;
	}

}

