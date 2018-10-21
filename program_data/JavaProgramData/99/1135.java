package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		double n;
		double x;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double g;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Double.parseDouble(tempVar2);
			}
			if (x <= 18)
			{
			a++;
			i++;
			}
			else if (x >= 19 && x <= 35)
			{
				b++;
				i++;
			}
			else if (x >= 36 && x <= 60)
			{
				c++;
				i++;
			}
			else if (x > 60)
			{
				d++;
				i++;
			}
		}
		 e = 100 * a / n;
		 f = 100 * b / n;
		 g = 100 * c / n;
		 h = 100 * d / n;
		 System.out.printf("1-18: %.2lf%%\n",e);
		 System.out.printf("19-35: %.2lf%%\n",f);
		 System.out.printf("36-60: %.2lf%%\n",g);
		 System.out.printf("Over60: %.2lf%%\n",h);
		 return 0;
	}


}

