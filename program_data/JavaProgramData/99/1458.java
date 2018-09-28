package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
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
				a[i] = Double.parseDouble(tempVar2);
			}

		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 1 && a[i] <= 18)
			{
				sum1 = sum1 + 1;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				sum2 = sum2 + 1;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				sum3 = sum3 + 1;
			}
			if (a[i] >= 61)
			{
				sum4 = sum4 + 1;
			}
		}
		System.out.printf("1-18: %.2lf%\n",sum1 / n * 100);
		System.out.printf("19-35: %.2lf%\n",sum2 / n * 100);
		System.out.printf("36-60: %.2lf%\n",sum3 / n * 100);
		System.out.printf("60??: %.2lf%\n",sum4 / n * 100);




		return 0;
	}


}

