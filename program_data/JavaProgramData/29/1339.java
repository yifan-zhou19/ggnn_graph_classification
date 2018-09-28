package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	for (scanf("%d", m);m--;)
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double tot = 0;
	double a;
	double b;
	a = 1;
	b = 2;
	while (n-- != 0)
	{
	tot += b / a;
	int c = a + b;
	a = b;
	b = c;
	}
	System.out.printf("%.3f\n",tot);
	}
	return 0;
	}
}

