package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
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
				sum1 += 1;
			}
			else if (a[i] <= 35 && a[i] >= 19)
			{
				sum2 += 1;
			}
			else if (a[i] <= 60 && a[i] >= 36)
			{
				sum3 += 1;
			}
			else if (a[i] > 60)
			{
				sum4 += 1;
			}
		}
		double p1;
		double p2;
		double p3;
		double p4;
		p1 = (double)100 * (double)sum1 / n;
		p2 = (double)100 * (double)sum2 / n;
		p3 = (double)100 * (double)sum3 / n;
		p4 = (double)100 * (double)sum4 / n;
		  System.out.printf("1-18: %.2lf%\n",p1);
		System.out.printf("19-35: %.2lf%\n",p2);
		System.out.printf("36-60: %.2lf%\n",p3);
		System.out.printf("60??: %.2lf%\n",p4);
		return 0;
	}

}

