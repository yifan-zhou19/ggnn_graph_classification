package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[101];
	int i;
	double s = 0.0;
	double b = 0.0;
	double c = 0.0;
	double d = 0.0;
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
					if (a[i] <= 18)
					{
					s += 1;
					}
					else if (a[i] <= 35)
					{
					b += 1;
					}
					else if (a[i] <= 60)
					{
					c += 1;
					}
					else
					{
					d += 1;
					}
	}
	System.out.printf("1-18: %.2lf%%\n",s * 100 / n);
	System.out.printf("19-35: %.2lf%%\n",b * 100 / n);
	System.out.printf("36-60: %.2lf%%\n",c * 100 / n);
	System.out.printf("60??: %.2lf%%",d * 100 / n);
		return 0;
	}

}

