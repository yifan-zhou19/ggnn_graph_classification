package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double e)
	{
		double s;
		double sa;
		e = 3.1415926 * e / 180 / 2;
		s = (a + b + c + d) / 2;
		sa = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e);
		if (sa < 0)
		{
			return -1;
		}
		else
		{
			return Math.sqrt(sa);
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		ans = area(a, b, c, d, e);
		if (ans < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%0.4lf\n",ans);
		}
		return 0;
	}

}

