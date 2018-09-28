package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double r)
	{
		double s;
		double s1;
		double s2;
		double co;
		s = 0.5 * (a + b + c + d);
		r = r / 180;
		r = r / 2;
		r = r * PI;
		co = Math.cos(r);
		s1 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * co * co;
		if (s1 < 0)
		{
			return 0;
		}
		s2 = Math.sqrt(s1);
		return (s2);
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s1;
		double r;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			r = Double.parseDouble(tempVar5);
		}
		s1 = f(a, b, c, d, r);
		if (s1 == 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4f",s1);
		}
	}


}

