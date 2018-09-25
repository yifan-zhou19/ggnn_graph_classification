package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[101];
		double q = 0;
		double w = 0;
		double e = 0;
		double r = 0;
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				q++;
			}
			if (a[i] <= 35 && a[i] >= 19)
			{
				w++;
			}
			if (a[i] <= 60 && a[i] >= 36)
			{
				e++;
			}
			if (a[i] >= 61)
			{
				r++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",q / n * 100);
		System.out.printf("19-35: %.2lf%%\n",w / n * 100);
		System.out.printf("36-60: %.2lf%%\n",e / n * 100);
		System.out.printf("60??: %.2lf%%\n",r / n * 100);


	}

}

