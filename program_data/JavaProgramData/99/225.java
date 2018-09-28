package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] u = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[i] = Integer.parseInt(tempVar2);
			}
		}
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		double s4 = 0.0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for (i = 0;i < n;i++)
		{
			if (u[i] < 19)
			{
				sum1++;
			}
			else if (u[i] > 18 && u[i] < 36)
			{
				sum2++;
			}
			else if (u[i] > 35 && u[i] < 61)
			{
				sum3++;
			}
			else if (u[i] > 60)
			{
				sum4++;
			}
		}
		s1 = (double)100 * sum1 / n;
		s2 = (double)100 * sum2 / n;
		s3 = (double)100 * sum3 / n;
		s4 = (double)100 * sum4 / n;
		System.out.printf("1-18: %.2lf%%\n",s1);
		System.out.printf("19-35: %.2lf%%\n",s2);
		System.out.printf("36-60: %.2lf%%\n",s3);
		System.out.printf("60??: %.2lf%%",s4);
		return 0;
	}
}

