package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] z = new int[100];
	int i;
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
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
		z[i] = Integer.parseInt(tempVar2);
	}
	if (z[i] > 0 && z[i] < 19)
	{
	a = a + 1;
	}
	if (z[i] > 18 && z[i] < 36)
	{
	b = b + 1;
	}
	if (z[i] > 35 && z[i] < 61)
	{
	c = c + 1;
	}
	else if (z[i] > 60)
	{
	d = d + 1;
	}
	}
	System.out.printf("1-18: %.2lf%%\n",100 * a / n);
	System.out.printf("19-35: %.2lf%%\n",100 * b / n);
	System.out.printf("36-60: %.2lf%%\n",100 * c / n);
	System.out.printf("60??: %.2lf%%\n",100 * d / n);
	return 0;
	}

}

