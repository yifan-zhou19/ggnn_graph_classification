package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[n - 1] = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a = a + 1;
			}
					  if ((18 < sz[i]) && (sz[i] <= 35))
					  {
				b = b + 1;
					  }
					 if ((35 < sz[i]) && (sz[i] <= 60))
					 {
				c = c + 1;
					 }
					  if (sz[i] > 60)
					  {
				d = d + 1;
					  }
		}
		System.out.printf("1-18: %.2lf%%\n",a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",b / n * 100);
		System.out.printf("36-60: %.2lf%%\n",c / n * 100);
		System.out.printf("60??: %.2lf%%\n",d / n * 100);
		return 0;
	}
}

