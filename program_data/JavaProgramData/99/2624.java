package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int n;
		int i;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		double sum4 = 0;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				sum1 = sum1 + 1;
			}
			else if (19 <= a[i] != 0 && a[i] <= 35)
			{
				sum2 = sum2 + 1;
			}
			else if (36 <= a[i] != 0 && a[i] <= 60)
			{
				sum3 = sum3 + 1;
			}
			else
			{
				sum4 = sum4 + 1;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)(sum1 / n * 100));
		System.out.printf("19-35: %.2lf%%\n",(double)(sum2 / n * 100));
		System.out.printf("36-60: %.2lf%%\n",(double)(sum3 / n * 100));
		System.out.printf("60??: %.2lf%%\n",(double)(sum4 / n * 100));
	}

}

