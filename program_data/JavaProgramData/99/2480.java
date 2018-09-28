package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int old;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				old = Integer.parseInt(tempVar2);
			}
			if (old <= 18)
			{
				n1 += 1;
			}
			if (old >= 19 && old <= 35)
			{
				n2 += 1;
			}
			if (old >= 36 && old <= 60)
			{
				n3 += 1;
			}
			if (old >= 61)
			{
				n4 += 1;
			}
		}

		double b1 = 100.0 * n1 / n;
		double b2 = 100.0 * n2 / n;
		double b3 = 100.0 * n3 / n;
		double b4 = 100.0 * n4 / n;

		System.out.printf("1-18: %.2lf%%\n",b1);
		System.out.printf("19-35: %.2lf%%\n",b2);
		System.out.printf("36-60: %.2lf%%\n",b3);
		System.out.printf("60??: %.2lf%%",b4);

		return 0;
	}
}

