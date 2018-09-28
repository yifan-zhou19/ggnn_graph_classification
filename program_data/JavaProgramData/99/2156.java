package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double q;
		double a1 = 0;
		double a2 = 0;
		double a3 = 0;
		double a4 = 0;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = (double)n;
		for (i = 0;i < n;i++)
		{
			int w;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = Integer.parseInt(tempVar2);
			}
			if (w <= 18)
			{
				a1 = a1 + 1;
			}
			else if (w < 36)
			{
				a2 = a2 + 1;
			}
			else if (w < 61)
			{
				a3 = a3 + 1;
			}
			else
			{
				a4 = a4 + 1;
			}
		}
		System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%\n",a1 * 100 / q,a2 * 100 / q,a3 * 100 / q,a4 * 100 / q);
		return 0;
	}
}

