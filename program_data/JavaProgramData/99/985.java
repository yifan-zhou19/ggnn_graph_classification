package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num;
		int i = 1;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double e;
		double f;
		double g;
		double h;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (num < 19)
			{
				a++;
			}
			else if (num < 36)
			{
				b++;
			}
			else if (num < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
			i++;
			continue;
		}
		e = a;
		f = b;
		g = c;
		h = d;
		e = e / n * 100;
		f = f / n * 100;
		g = g / n * 100;
		h = h / n * 100;
		System.out.printf("1-18:% .2lf%%\n",e);
		System.out.printf("19-35:% .2lf%%\n",f);
		System.out.printf("36-60:% .2lf%%\n",g);
		System.out.printf("60??:% .2lf%%\n",h);
		return 0;
	}
}

