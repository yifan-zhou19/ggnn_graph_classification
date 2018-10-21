package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int s = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
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
				t = Integer.parseInt(tempVar2);
			}
			s++;
			if (t <= 18 && t>0)
			{
				a++;
			}
			else if (t <= 35)
			{
				b++;
			}
			else if (t <= 60)
			{
				c++;
			}
			else if (t > 60)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)a * 100 / (double)s);
		System.out.printf("19-35: %.2lf%%\n",(double)b * 100 / (double)s);
		System.out.printf("36-60: %.2lf%%\n",(double)c * 100 / (double)s);
		System.out.printf("60??: %.2lf%%\n",(double)d * 100 / (double)s);
		return 0;
	}
}

