package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int t;
	double[] a = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	double e1 = 0.0;
	double e2 = 0.0;
	double e3 = 0.0;
	double e4 = 0.0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (;k > 0;k--)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	System.out.print("\n");
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
		e1 = e1 + a[i];
	}
	e2 = e1 / n;
	for (i = 0;i < n;i++)
	{
		e3 = e3 + (a[i] - e2) * (a[i] - e2);
	}
	e4 = Math.sqrt(e3 / n);
	System.out.printf("%.5lf\n",e4);
	e1 = 0;
	e2 = 0;
	e3 = 0;
	e4 = 0;
	}
	return 0;
	}

}

