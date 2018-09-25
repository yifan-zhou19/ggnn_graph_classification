package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int e = 0;
		int b = 0;
		int c = 0;
		int d = 0;
	double w;
	double x;
	double y;
	double z;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		if (a[i] <= 18)
		{
			e++;
		}
		if (a[i] > 18 && a[i] <= 35)
		{
			b++;
		}
		if (a[i] > 35 && a[i] <= 60)
		{
			c++;
		}
		if (a[i] > 60)
		{
			d++;
		}
	}
	w = (double)100 * e / n;
	x = (double)100 * b / n;
	y = (double)100 * c / n;
	z = (double)100 * d / n;
	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",w,x,y,z);
	return 0;
	}
}

