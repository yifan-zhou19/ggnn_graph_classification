package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		i = 1;
		double p;
		double q;
		double x;
		double y;
		p = 0;
		q = 0;
		x = 0;
		y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
				p = p + 1;
			}
			else if (a <= 35)
			{
				q = q + 1;
			}
			else if (a <= 60)
			{
				x = x + 1;
			}
			else
			{
				y = y + 1;
			}
			i++;
		}
		p = p / n * 100;
		q = q / n * 100;
		x = x / n * 100;
		y = y / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",p, q, x, y);
		return 0;
	}

}

