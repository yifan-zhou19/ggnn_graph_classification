package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		double d = 0;
		double e = 0;
		double f = 0;
		double g = 0;
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
				d += 1;
			}
			else if (a[i] <= 35)
			{
				e += 1;
			}
			else if (a[i] <= 60)
			{
				f += 1;
			}
			else
			{
				g += 1;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",d * 100 / n);
		System.out.printf("19-35: %.2lf%%\n",e * 100 / n);
		System.out.printf("36-60: %.2lf%%\n",f * 100 / n);
		System.out.printf("60??: %.2lf%%\n",g * 100 / n);
		return 0;
	}

}

