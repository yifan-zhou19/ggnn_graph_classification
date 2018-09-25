package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[4];
		double f;
		double c;
		double d;
		double e;
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
						 b[0] = 0;
						 b[1] = 0;
						 b[2] = 0;
						 b[3] = 0;
		for (i = 0;i < n;i++)
		{
						 if (a[i] < 19)
						 {
									 b[0] += 1;
						 }
						 if (a[i] > 18 && a[i] < 36)
						 {
											  b[1] += 1;
						 }
						 if (a[i] > 35 && a[i] < 61)
						 {
											  b[2] += 1;
						 }
						 if (a[i] > 60)
						 {
									 b[3] += 1;
						 }
		}
		f = b[0] * 1.0 / n * 100;
		c = b[1] * 1.0 / n * 100;
		d = b[2] * 1.0 / n * 100;
		e = b[3] * 1.0 / n * 100;
		System.out.printf("1-18: %.2lf%%\n",f);
		System.out.printf("19-35: %.2lf%%\n",c);
		System.out.printf("36-60: %.2lf%%\n",d);
		System.out.printf("60??: %.2lf%%",e);
		return 0;
	}


}

