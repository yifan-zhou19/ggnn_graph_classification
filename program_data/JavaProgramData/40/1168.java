package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
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
		void square(double,double,double,double,double);
		square(a, b, c, d, e);

	}

	public static void square(double a,double b,double c,double d,double e)
	{
		double s;
		double o;
		double S;
		double f;
		f = e / 2;
		s = (a + b + c + d) / 2;
		o = (PI * f) / 180;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o) * Math.cos(o)) < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o) * Math.cos(o));
			System.out.printf("%.4lf",S);
		}
	}



}

