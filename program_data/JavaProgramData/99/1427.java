package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		double n;
		int[] p = new int[102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] <= 18)
			{
			  sum1 += 1;
			}
			else if (p[i] <= 35)
			{
				sum1 += 0;
			}
			else if (p[i] <= 60)
			{
				sum1 += 0;
			}
			else
			{
				sum1 += 0;
			}
		}
	for (i = 0;i < n;i++)
	{
			if (p[i] <= 18)
			{
			  sum2 += 0;
			}
			else if (p[i] <= 35)
			{
				sum2 += 1;
			}
			else if (p[i] <= 60)
			{
				sum2 += 0;
			}
			else
			{
				sum2 += 0;
			}
	}
	for (i = 0;i < n;i++)
	{
			if (p[i] <= 18)
			{
			  sum3 += 0;
			}
			else if (p[i] <= 35)
			{
				sum3 += 0;
			}
			else if (p[i] <= 60)
			{
				sum3 += 1;
			}
			else
			{
				sum3 += 0;
			}
	}
	for (i = 0;i < n;i++)
	{
			if (p[i] <= 18)
			{
			  sum4 += 0;
			}
			else if (p[i] <= 35)
			{
				sum4 += 0;
			}
			else if (p[i] <= 60)
			{
				sum4 += 0;
			}
			else
			{
				sum4 += 1;
			}
	}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",(double)((sum1 * 100) / n),(double)((sum2 * 100) / n),(double)((sum3 * 100) / n),(double)((sum4 * 100) / n));
		return 0;
	}


}

