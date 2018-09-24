package <missing>;

public class GlobalMembers
{
	public static double getarea(double a, double b, double c, double d, double e, double jiaodu)
	{
		  double zanshimianji;
		  zanshimianji = (double)((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * jiaodu * jiaodu);
		  return zanshimianji;
	}
	public static int Main()
	{
		double k;
		double l;
		double m;
		double n;
		double s;
		double jiao;
		double area;
		double zanshi;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			jiao = Double.parseDouble(tempVar5);
		}
		s = (k + l + m + n) / 2;
		jiao = jiao / 360 * PI;
		jiao = Math.cos(jiao);
		zanshi = getarea(k, l, m, n, s, jiao);
		if (zanshi < 0)
		{
		 System.out.print("Invalid input");
		}
		else
		{
			  area = Math.sqrt(zanshi);
			  System.out.printf("%.4lf",area);
		}


		return 0;
	}

}

