package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e;
		double f;
		double g;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
		if (x <= 18)
		{
			a = a + 1;
		}
		else if (x <= 35)
		{
			b = b + 1;
		}
		else if (x <= 60)
		{
			c = c + 1;
		}
		else
		{
			d = d + 1;
		}
		}
		e = 1.0 * a / n * 100;
		f = 1.0 * b / n * 100;
		g = 1.0 * c / n * 100;
		h = 1.0 * d / n * 100;

			   System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",e,f,g,h);


		return 0;
	}

}

