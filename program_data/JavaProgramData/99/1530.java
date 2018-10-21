package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int o;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double al;
		double bl;
		double cl;
		double dl;
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
				o = Integer.parseInt(tempVar2);
			}
			if (o < 19)
			{
				a += 1;
			}
			else if (o < 36 && o>18)
			{
				b += 1;
			}
			else if (o < 61 && o>35)
			{
				c += 1;
			}
			else if (o > 60)
			{
				d += 1;
			}
		}
		al = 100 * a / n;
		bl = 100 * b / n;
		cl = 100 * c / n;
		dl = 100 * d / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",al,bl,cl,dl);
		return 0;
	}



}

