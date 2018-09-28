package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int age;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double aa;
		double bb;
		double cc;
		double dd;
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
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
			{
				a += 1;
			}
			else if (age <= 35)
			{
				b += 1;
			}
			else if (age <= 60)
			{
				c += 1;
			}
			else
			{
				d += 1;
			}
		}
		aa = a * 100.0 / n;
		bb = b * 100.0 / n;
		cc = c * 100.0 / n;
		dd = d * 100.0 / n;
		System.out.printf("1-18: %.2lf%%\n",aa);
		System.out.printf("19-35: %.2lf%%\n",bb);
		System.out.printf("36-60: %.2lf%%\n",cc);
		System.out.printf("60??: %.2lf%%\n",dd);
		return 0;
	}
}

