package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double t;
		double r;
		double w;
		double n;
		double i;
		double a;
		double b;
		double c;
		double j = 0;
		double k = 0;
		double l = 0;
		double m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			if (a < 19)
			{
				j++;
			}
			if (a < 36 && a>18)
			{
				k++;
			}
			if (a < 61 && a>35)
			{
				l++;
			}
			if (a > 60)
			{
				m++;
			}
		}
		r = 100 * j / n;
		s = 100 * k / n;
		t = 100 * l / n;
		w = 100 * m / n;
			System.out.printf("1-18: %.2lf%%\n",r);
		System.out.printf("19-35: %.2lf%%\n",s);
		System.out.printf("36-60: %.2lf%%\n",t);
		System.out.printf("60??: %.2lf%%\n",w);


		return 0;
	}

}

