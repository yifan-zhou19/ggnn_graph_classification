package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] z = new int[100];
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		double p1;
		double p2;
		double p3;
		double p4;
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
				z[i] = Integer.parseInt(tempVar2);
			}

			if (z[i] < 19)
			{
				sum1 = sum1 + 1;
			}
			if (z[i] > 18 && z[i] < 36)
			{
				sum2 = sum2 + 1;
			}
			if (z[i] > 35 && z[i] < 61)
			{
				sum3 = sum3 + 1;
			}
			if (z[i] > 60)
			{
				sum4 = sum4 + 1;
			}
		}
		p1 = (double)sum1 / (double)n;
			p2 = (double)sum2 / (double)n;
			p3 = (double)sum3 / (double)n;
			p4 = (double)sum4 / (double)n;
		System.out.printf("1-18: %.2lf%%\n",p1 * 100);
		System.out.printf("19-35: %.2lf%%\n",p2 * 100);
		System.out.printf("36-60: %.2lf%%\n",p3 * 100);
		System.out.printf("60??: %.2lf%%",p4 * 100);
		return 0;
	}
}

