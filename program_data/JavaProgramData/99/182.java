package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int age_1 = 0;
		int age_2 = 0;
		int age_3 = 0;
		int age_4 = 0;
		int[] age = new int[100];
		int i;
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
				age_1++;
			}
			else if (age[i] <= 35 && age[i] >= 19)
			{
				age_2++;
			}
			else if (age[i] <= 60 && age[i] >= 36)
			{
				age_3++;
			}
			else if (age[i] >= 61)
			{
				age_4++;
			}
		}
		double bilv_1 = (double)age_1 / n;
		double bilv_2 = (double)age_2 / n;
		double bilv_3 = (double)age_3 / n;
		double bilv_4 = (double)age_4 / n;
		System.out.printf("1-18: %.2lf%%\n",bilv_1 * 100);
		System.out.printf("19-35: %.2lf%%\n",bilv_2 * 100);
		System.out.printf("36-60: %.2lf%%\n",bilv_3 * 100);
		System.out.printf("60??: %.2lf%%",bilv_4 * 100);
		return 0;
	}
}

