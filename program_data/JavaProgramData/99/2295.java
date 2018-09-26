package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e;
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
				e = Integer.parseInt(tempVar2);
			}
			if (e <= 18)
			{
				a += 1;
			}
			else
			{
				if (e <= 35)
				{
				b += 1;
				}
			else
			{
				if (e <= 60)
				{
				c += 1;
				}
			else
			{
				d += 1;
			}
			}
			}

		}

		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",100.0 * a / n,100.0 * b / n,100.0 * c / n,100.0 * d / n);
		return 0;
	}

}

