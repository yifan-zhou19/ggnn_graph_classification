package <missing>;

public class GlobalMembers
{
	public static double max(double a,double b,double c,double d,double f,double s)
	{
		double S;
	   S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f) * Math.cos(f));
		return (S);
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double s;
		double S;
		double g;
		double max = new double(double a,double b,double c,double d,double f,double s);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		f = e / 360 * 3.1415926;
		g = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f) * Math.cos(f);
		if (g >= 0)
		{
			S = max(a, b, c, d, f, s);
			System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}
}

