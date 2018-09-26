package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[101];
	int[] b = new int[4];
	double[] c = new double[4];
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
		if (a[i] >= 1 && a[i] <= 18)
		{
		b[0] += 1;
		}
	if (a[i] >= 19 && a[i] <= 35)
	{
		b[1] += 1;
	}
	if (a[i] >= 36 && a[i] <= 60)
	{
		b[2] += 1;
	}
	if (a[i] > 60)
	{
		b[3] += 1;
	}
	}
	for (i = 0;i < 4;i++)
	{
	 c[i] = (b[i] * 1.0 * 100) / n;
	}
	System.out.printf("1-18: %.2lf%%\n",c[0]);
	System.out.printf("19-35: %.2lf%%\n",c[1]);
	System.out.printf("36-60: %.2lf%%\n",c[2]);
	System.out.printf("60??: %.2lf%%\n",c[3]);
	return 0;
	}

}

