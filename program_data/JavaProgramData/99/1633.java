package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int[] age = new int[100];
		double per1;
		double per2;
		double per3;
		double per4;
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
			if (age[i] <= 18)
			{
				sum1 += 1;
			}
			else
			{
				if (age[i] >= 19 && age[i] <= 35)
				{
					sum2 += 1;
				}
				else
				{
					if (age[i] >= 36 && age[i] <= 60)
					{
						sum3 += 1;
					}
					else
					{
						sum4 += 1;
					}
				}
			}
		}
		per1 = sum1 * 1.0 / n * 100;
		per2 = sum2 * 1.0 / n * 100;
		per3 = sum3 * 1.0 / n * 100;
		per4 = sum4 * 1.0 / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%", per1, per2, per3, per4);
		return 0;
	}

}

