package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		double i = 1;
		double a;
		double b;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			if (y <= 18)
			{
				a += 1;
			}
			else if (y > 18 && y <= 35)
			{
				b += 1;
			}
			else if (y > 35 && y <= 60)
			{
				c += 1;
			}
			else if (y > 60)
			{
				d += 1;
			}
			i++;
		}
			System.out.printf("1-18: %.2lf%%\n",100 * a / n);
			System.out.printf("19-35: %.2lf%%\n",100 * b / n);
			System.out.printf("36-60: %.2lf%%\n",100 * c / n);
			System.out.printf("60??: %.2lf%%\n",100 * d / n);
		return 0;
	}
}

