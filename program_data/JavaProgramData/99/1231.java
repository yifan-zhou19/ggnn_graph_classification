package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] e = new int[100];
	double a;
	double b;
	double d;
	double c;
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
		e[i] = Integer.parseInt(tempVar2);
	}
	if (e[i] <= 18 && e[i] >= 1)
	{
	b++;
	}
	else if (e[i] >= 19 && e[i] <= 35)
	{
	a++;
	}
	else if (e[i] >= 36 && e[i] <= 60)
	{
	c++;
	}
	else
	{
		d++;
	}
	}
	System.out.printf("1-18: %.2lf%%\n",b * 100 / n);
	System.out.printf("19-35: %.2lf%%\n",a * 100 / n);
	System.out.printf("36-60: %.2lf%%\n",c * 100 / n);
	System.out.printf("Over60: %.2lf%%\n",100 - b * 100 / n - a * 100 / n - c * 100 / n);
	return 0;
	}
}

