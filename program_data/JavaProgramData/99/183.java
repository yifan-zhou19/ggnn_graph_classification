package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e = 0;
		int d = 0;
		int f = 0;
		int g = 0;
		int k = 0;
		int a;
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
			if (a <= 18)
			{
				e++;
			}
			if (a >= 19 && a <= 35)
			{
				d++;
			}
			if (a >= 36 && a <= 60)
			{
				f++;
			}
			if (a >= 61)
			{
				g++;
			}
		}
		k = e + d + f + g;
		double x;
		double y;
		double z;
		double w;
		x = (double)e / k * 100;
		y = (double)d / k * 100;
		z = (double)f / k * 100;
		w = (double)g / k * 100;
		System.out.printf("1-18: %.2lf%%\n",x);
		System.out.printf("19-35: %.2lf%%\n",y);
		System.out.printf("36-60: %.2lf%%\n",z);
		System.out.printf("60??: %.2lf%%\n",w);
		return 0;
	}

}

