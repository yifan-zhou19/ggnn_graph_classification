package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[101];
		double b;
		double c;
		double d;
		double e;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
						  if (a[i] <= 18)
						  {
							  sum1 += 1;
						  }
						  else if (a[i] >= 19 && a[i] <= 35)
						  {
							  sum2 += 1;
						  }
						  else if (a[i] >= 36 && a[i] <= 60)
						  {
							  sum3 += 1;
						  }
						  else
						  {
							  sum4 += 1;
						  }
		}
		b = (100 * sum1) / n;
		c = (100 * sum2) / n;
		d = (100 * sum3) / n;
		e = (100 * sum4) / n;
		System.out.printf("1-18: %.2lf%%\n",b);
		System.out.printf("19-35: %.2lf%%\n",c);
		System.out.printf("36-60: %.2lf%%\n",d);
		System.out.printf("60??: %.2lf%%\n",e);
		return 0;
	}
}

