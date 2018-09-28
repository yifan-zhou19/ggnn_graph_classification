package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18 && a >= 1)
			{
			   sum1++;
			}
			else if (a <= 35 && a >= 19)
			{
			   sum2++;
			}
			else if (a <= 60 && a >= 36)
			{
			   sum3++;
			}
			else if (a >= 60)
			{
			   sum4++;
			}
		}
		sum1 = (double)100 * sum1 / n;
		sum2 = (double)100 * sum2 / n;
		sum3 = (double)100 * sum3 / n;
		sum4 = (double)100 * sum4 / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",sum1,sum2,sum3,sum4);
		return 0;
	}
}

