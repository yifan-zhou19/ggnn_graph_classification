package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int a;
		int i;
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
			if (a <= 18)
			{
				b = b + 1;
			}
			else if (a <= 35)
			{
				c = c + 1;
			}
			else if (a <= 60)
			{
				d = d + 1;
			}
			else
			{
				e = e+1;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)b / n * 100);
		System.out.printf("19-35: %.2lf%%\n",(double)c / n * 100);
		System.out.printf("36-60: %.2lf%%\n",(double)d / n * 100);
		System.out.printf("60??: %.2lf%%",(double)e / n * 100);
		return 0;
	}
}

