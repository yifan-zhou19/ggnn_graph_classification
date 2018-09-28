package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double q = 0;
		double w = 0;
		double e = 0;
		double r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double z;
		double x;
		double c;
		double v;
		for (i = 1;i <= n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			if (a >= 1 && a <= 18)
			{
				q++;
			}
			else if (a >= 19 && a <= 35)
			{
				w++;
			}
			else if (a >= 36 && a <= 60)
			{
				e++;
			}
			else
			{
				r++;
			}
		}
		z = (q / n) * 100;
		x = (w / n) * 100;
		c = (e / n) * 100;
		v = (r / n) * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",z,x,c,v);
		return 0;
	}


}

