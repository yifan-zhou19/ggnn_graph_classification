package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double sum = 0;
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
				sum++;
				if (a[i] >= 1 && a[i] <= 18)
				{
					b++;
				}
				if (a[i] >= 19 && a[i] <= 35)
				{
					c++;
				}
				 if (a[i] >= 36 && a[i] <= 60)
				 {
					d++;
				 }
				 if (a[i] > 60)
				 {
					e++;
				 }
		}
		System.out.printf("1-18: %.2lf%%\n",100 * b / sum);
		System.out.printf("19-35: %.2lf%%\n",100 * c / sum);
		System.out.printf("36-60: %.2lf%%\n",100 * d / sum);
		System.out.printf("60??: %.2lf%%\n",100 * e / sum);
		return 0;
	}


}

