package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
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
			else if (a >= 19 && a <= 35)
			{
				c = c + 1;
			}
			else if (a >= 36 && a <= 60)
			{
				d = d + 1;
			}
			else if (a > 60)
			{
				e = e+1;
			}
		}
		double f;
		double g;
		double h;
		double k;
		f = 1.0 * b / n * 100;
		g = 1.0 * c / n * 100;
		h = 1.0 * d / n * 100;
		k = 1.0 * e / n * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2lf%%\n",f);
		System.out.print("19-35: ");
		System.out.printf("%.2lf%%\n",g);
		System.out.print("36-60: ");
		System.out.printf("%.2lf%%\n",h);
		System.out.print("60??: ");
		System.out.printf("%.2lf%%\n",k);
		return 0;
	}



}

