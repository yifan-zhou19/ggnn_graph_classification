package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[10000];
	double[] b = new double[4];
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
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] <= 18)
	{
	b[0] = b[0] + 1;
	}
	if (a[i] > 18 && a[i] <= 35)
	{
	b[1] = b[1] + 1;
	}
	if (a[i] > 35 && a[i] <= 60)
	{
	b[2] = b[2] + 1;
	}
	if (a[i] > 60)
	{
	b[3] = b[3] + 1;
	}
	}
	for (i = 0;i < 4;i++)
	{
	b[i] = (100.0 * b[i]) / n;
	}
	System.out.printf("1-18: %.2lf%%\n",b[0]);
	System.out.printf("19-35: %.2lf%%\n",b[1]);
	System.out.printf("36-60: %.2lf%%\n",b[2]);
	System.out.printf("Over60: %.2lf%%\n",b[3]);
	return 0;
	}
}

