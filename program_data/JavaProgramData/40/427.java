package <missing>;

public class GlobalMembers
{
	public static final double pri = 3.1415926;

	public static double mianji(double a,double b,double c,double d,double x)
	{
		double s;
		double t;
		s = 1.0 / 2 * (a + b + c + d);
		x = x / 360 * pri;
		t = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x) * Math.cos(x));
		if (t < 0)
		{
			return 0;
		}
		else
		{
			return Math.sqrt(t);
		}
	}
	public static void Main()
	{
		double x;
		double y;
		double u;
		double v;
		double w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			u = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			v = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			w = Double.parseDouble(tempVar5);
		}
		if (mianji(x, y, u, v, w).getValue() != 0)
		{
		   System.out.printf("%.4lf",mianji(x, y, u, v, w));
		}
		else
		{
			System.out.print("Invalid input");
		}
	}

}

