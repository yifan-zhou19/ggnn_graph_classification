package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int aa;
	double a1 = 0;
	double b1 = 0;
	double c1 = 0;
	double d1 = 0;
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
			aa = Integer.parseInt(tempVar2);
		}
		if (aa <= 18)
		{
		  a1++;
		}
		else if (aa <= 35)
		{
		  b1++;
		}
		else if (aa <= 60)
		{
		  c1++;
		}
		else if (aa > 60)
		{
		  d1++;
		}


	}
	System.out.printf("1-18: %.2lf%%\n",100 * a1 / n);
		System.out.printf("19-35: %.2lf%%\n",100 * b1 / n);
		System.out.printf("36-60: %.2lf%%\n",100 * c1 / n);
		System.out.printf("60??: %.2lf%%",100 * d1 / n);
	return 0;
	}
}

