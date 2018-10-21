package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int i = 0;
		double b = 0;
		 double c = 0;
			  double d = 0;
	double e = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] >= 1 && a[i] <= 18)
			{
				b = b + 1;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				c = c + 1;
			}
		  if (a[i] >= 36 && a[i] <= 60)
		  {
			  d = d + 1;
		  }
		 if (a[i] >= 61)
		 {
			 e = e+1;
		 }
		}
		System.out.printf("1-18: %.2f%%\n",100 * b / (1.0 * n));
		System.out.printf("19-35: %.2f%%\n",100 * c / (1.0 * n));
	   System.out.printf("36-60: %.2f%%\n",100 * d / (1.0 * n));
		System.out.printf("60??: %.2f%%",100 * e / (1.0 * n));
		return 0;
	}
}

