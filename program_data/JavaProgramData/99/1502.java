package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		double s = 0;
		double d = 0;
		double f = 0;
		double g = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			if (0 <= a != 0 && a <= 18)
			{
				s = s + 1;
			}
			else if (19 <= a != 0 && a <= 35)
			{
				d = d + 1;
			}
			else if (36 <= a != 0 && a <= 60)
			{
				f = f + 1;
			}
			else if (60 < a)
			{
				g = g + 1;
			}
		}
		s = 100 * s;
		d = 100 * d;
		f = 100 * f;
		g = 100 * g;
			System.out.printf("1-18: %0.2lf%%\n",s / n);
			System.out.printf("19-35: %0.2lf%%\n",d / n);
			System.out.printf("36-60: %0.2lf%%\n",f / n);
			System.out.printf("60??: %0.2lf%%\n",g / n);
			return 0;
	}

}

