package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		int i;
		double[] a = new double[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] < 19)
			{
				count1++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				count2++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				count3++;
			}
			if (a[i] > 60)
			{
				count4++;
			}
		}
		double per1 = count1 / n * 100;
		double per2 = count2 / n * 100;
		double per3 = count3 / n * 100;
		double per4 = count4 / n * 100;
		System.out.printf("1-18: %.2lf%%\n",per1);
		System.out.printf("19-35: %.2lf%%\n",per2);
		System.out.printf("36-60: %.2lf%%\n",per3);
		System.out.printf("60??: %.2lf%%\n",per4);
	}
}

