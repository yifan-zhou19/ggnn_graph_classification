package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int t;
	double n;
	double[] a = new double[4];

	for (i = 0;i < 4;i++)
	{
	a[i] = 0;
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Double.parseDouble(tempVar);
	}
	for (i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
	if (t >= 1 && t <= 18)
	{
	   a[0]++;
	}
	if (t >= 19 && t <= 35)
	{
	   a[1]++;
	}
	if (t >= 36 && t <= 60)
	{
	a[2]++;
	}
	if (t > 60)
	{
	a[3]++;
	}
	}
	a[0] = a[0] / n;
	a[1] = a[1] / n;
	a[2] = a[2] / n;
	a[3] = a[3] / n;
	System.out.printf("1-18: %.2lf%%\n",a[0] * 100);
	System.out.printf("19-35: %.2lf%%\n",a[1] * 100);
	System.out.printf("36-60: %.2lf%%\n",a[2] * 100);
	System.out.printf("60??: %.2lf%%\n",a[3] * 100);
	}
}

