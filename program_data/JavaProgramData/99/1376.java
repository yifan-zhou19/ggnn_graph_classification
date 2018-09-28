package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[100];
		int i;
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] <= 18)
			{
				sum1++;
			}
			else if (b[i] >= 19 && b[i] <= 35)
			{
				sum2++;
			}
			else if (b[i] >= 36 && b[i] <= 60)
			{
				sum3++;
			}
			else
			{
				sum4++;
			}
		}
		double a;
		double B;
		double c;
		double d;
		a = 100 * (double)sum1 / n;
		B = 100 * (double)sum2 / n;
		c = 100 * (double)sum3 / n;
		d = 100 * (double)sum4 / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}


}

