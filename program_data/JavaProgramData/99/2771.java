package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		double a18 = 0.0;
		double a19 = 0.0;
		double a36 = 0.0;
		double a61 = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				a18++;
			}
			if (a[i] <= 35 && a[i] >= 19)
			{
				a19++;
			}
			if (a[i] <= 60 && a[i] >= 36)
			{
				a36++;
			}
			if (a[i] >= 61)
			{
				a61++;
			}
		}
		a18 = (double)(a18 / n * 100);
	a19 = (double)(a19 / n * 100);
			a36 = (double)(a36 / n * 100);
			a61 = (double)(a61 / n * 100);
		System.out.printf("1-18: %.2lf%%\n",a18);
		System.out.printf("19-35: %.2lf%%\n",a19);
		System.out.printf("36-60: %.2lf%%\n",a36);
		System.out.printf("60??: %.2lf%%\n",a61);
		return 0;
	}

}

