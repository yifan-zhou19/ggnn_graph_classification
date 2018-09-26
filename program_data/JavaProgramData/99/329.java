package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] age = new int[100];
		int n;
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int tal = 0;
		double a1 = 0;
		double a2 = 0;
		double a3 = 0;
		double a4 = 0;
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
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] <= 18)
			{
				sum1++;
			}
			if (age[i] > 18 && age[i] < 36)
			{
				sum2++;
			}
			if (age[i] > 35 && age[i] < 61)
			{
				sum3++;
			}
			if (age[i] > 60)
			{
				sum4++;
			}
		}
		for (i = 0;i < n;i++)
		{
			tal++;
		}
		a1 = (double)sum1 / tal * 100;
		a2 = (double)sum2 / tal * 100;
		a3 = (double)sum3 / tal * 100;
		a4 = (double)sum4 / tal * 100;
		System.out.printf("1-18: %.2lf%%\n",a1);
		System.out.printf("19-35: %.2lf%%\n",a2);
		System.out.printf("36-60: %.2lf%%\n",a3);
		System.out.printf("60??: %.2lf%%",a4);
		return 0;
	}
}

