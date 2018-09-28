package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double t;
	double s;
	double h;
	double y;
	double lt;
	double ls;
	double lh;
	double ly;
	int[] k = new int[100];
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
	if (k[i] <= 18)
	{
	t++;
	}
	else if (k[i] > 18 && k[i] <= 35)
	{
	s++;
	}
	else if (k[i] > 35 && k[i] <= 60)
	{
	h++;
	}
	else if (k[i] > 60)
	{
	y++;
	}
	}
	t = (double)t / n;
	s = (double)s / n;
	h = (double)h / n;
	y = (double)y / n;
	lt = 100 * t;
	ls = 100 * s;
	lh = 100 * h;
	ly = 100 * y;
	System.out.printf("1-18: %.2lf%\n",lt);
	System.out.printf("19-35: %.2lf%\n",ls);
	System.out.printf("36-60: %.2lf%\n",lh);
	System.out.printf("60??: %.2lf%\n",ly);
	return 0;
	}

}

