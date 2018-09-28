package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int y;
		double a;
		double b;
		double c;
		double d;
		double x;
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
				y = Integer.parseInt(tempVar2);
			}
			if (y >= 0 && y <= 18)
			{
				n1 += 1;
			}
			else if (y >= 19 && y <= 35)
			{
				n2 += 1;
			}
			else if (y >= 36 && y <= 60)
			{
				n3 += 1;
			}
			else
			{
				n4 += 1;
			}
		}
		x = n;
		a = n1 / x;
		b = n2 / x;
		c = n3 / x;
		d = n4 / x;
		System.out.printf("1-18: %.2lf%%\n",100 * a);
		System.out.printf("19-35: %.2lf%%\n",100 * b);
		System.out.printf("36-60: %.2lf%%\n",100 * c);
		System.out.printf("60??: %.2lf%%\n",100 * d);
		return 0;
	}
}

