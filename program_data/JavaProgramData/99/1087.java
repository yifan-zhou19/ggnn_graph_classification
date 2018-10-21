package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int[] x = new int[100];
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(x[i]) = Integer.parseInt(tempVar2);
	}
	}
	for (int i = 0;i < n;i++)
	{
		if (x[i] >= 1 && x[i] <= 18)
		{
		a++;
		}
	else if (x[i] >= 19 && x[i] <= 35)
	{
		b++;
	}
	else if (x[i] >= 36 && x[i] <= 60)
	{
		c++;
	}
	else
	{
		d++;
	}
	}
	System.out.printf("1-18: %.2lf%%\n",a * 100.0 / n);
	System.out.printf("19-35: %.2lf%%\n",b * 100.0 / n);
	System.out.printf("36-60: %.2lf%%\n",c * 100.0 / n);
	System.out.printf("Over60: %.2lf%%\n",d * 100.0 / n);
	return 0;
	}

}

