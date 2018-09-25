package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double x = 0;
	double y = 0;
	double z = 0;
	double w = 0;
	int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 100;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] <= 18)
	{
	x++;
	}
	else if (a[i] < 36)
	{
	y++;
	}
	else if (a[i] < 61)
	{
	z++;
	}
	else if (a[i] >= 60)
	{
	w++;
	}
	}
	System.out.printf("1-18: %.2lf%%\n",100.0 * x / n);
	System.out.printf("19-35: %.2lf%%\n",100.0 * y / n);
	System.out.printf("36-60: %.2lf%%\n",100.0 * z / n);
	System.out.printf("60??: %.2lf%%\n",100.0 * w / n);
	return 0;
	}

}

