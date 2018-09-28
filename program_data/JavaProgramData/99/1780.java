package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int nl;
		int[] nld = {0, 0, 0, 0};
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
				nl = Integer.parseInt(tempVar2);
			}
			if (nl <= 18)
			{
				nld[0]++;
			}

			if (nl > 18 && nl < 36)
			{
				nld[1]++;
			}

			if (nl > 35 && nl < 61)
			{
				nld[2]++;
			}

			if (nl > 60)
			{
				nld[3]++;
			}

		}
		System.out.printf("1-18: %.2lf%%\n",(100.0 * nld[0]) / n);
		 System.out.printf("19-35: %.2lf%%\n",(100.0 * nld[1]) / n);
		  System.out.printf("36-60: %.2lf%%\n",(100.0 * nld[2]) / n);
		   System.out.printf("60??: %.2lf%%\n",(100.0 * nld[3]) / n);
		return 0;
	}
}

