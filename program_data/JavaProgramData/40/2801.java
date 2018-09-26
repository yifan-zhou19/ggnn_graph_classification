package <missing>;

public class GlobalMembers
{
	public static int pd = 0;

	public static double S(double a,double b,double c,double d,double angle)
	{
		double s;
		double t;
		s = (a + b + c + d) / 2;
		t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		if (t < 0)
		{
			pd = 1;
			return 0;
		}
		else
		{
			return (Math.sqrt(t));
		}
	}

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
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
			angle = Double.parseDouble(tempVar5);
		}
		angle = angle * PI / 360;
		ans = S(a, b, c, d, angle);

		if (pd != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",ans);
		}

		return 0;
	}

}

