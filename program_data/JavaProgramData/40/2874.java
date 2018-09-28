package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double al;
		double o;
		double f = new double(double A,double B,double C,double D,double AL);
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
			al = Double.parseDouble(tempVar5);
		}
		o = f(a, b, c, d, al);
		if (o == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",o);
		}
		return 0;
	}

	public static double f(double A,double B,double C,double D,double AL)
	{
		double s;
		double S;
		s = (A + B + C + D) * 0.5;
		if (A * B * C * D * Math.cos(AL * Pi / 360) * Math.cos(AL * Pi / 360) > (s - A) * (s - B) * (s - C) * (s - D).getValue() != 0)
		{
			S = -1;
		}
		else
		{
			S = Math.sqrt((s - A) * (s - B) * (s - C) * (s - D) - A * B * C * D * Math.cos(AL * Pi / 360) * Math.cos(AL * Pi / 360));
		}
		return (S);
	}

}

