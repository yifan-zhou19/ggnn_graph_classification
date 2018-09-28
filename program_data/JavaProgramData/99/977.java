package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		int[] sz = new int[100];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		}
		int s1;
		int s2;
		int s3;
		int s4;
		s1 = 0;
		s2 = 0;
			s3 = 0;
			s4 = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
			s1 += 1;
			}
			else if (sz[i] <= 35)
			{
			s2 += 1;
			}
			else if (sz[i] <= 60)
			{
				s3 += 1;
			}
			else
			{
				s4 += 1;
			}
		}
	double a;
	double b;
	double c;
	double d;
	a = 1.0 * s1 / n * 100;
	b = 1.0 * s2 / n * 100;
	c = 1.0 * s3 / n * 100;
	d = 1.0 * s4 / n * 100;
	System.out.printf("1-18: %.2lf%%\n",a);
	System.out.printf("19-35: %.2lf%%\n",b);
	System.out.printf("36-60: %.2lf%%\n",c);
	System.out.printf("60??: %.2lf%%\n",d);
	return 0;
	}
}

