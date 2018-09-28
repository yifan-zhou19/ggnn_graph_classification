package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double o;
	public static double s(double a,double b,double c,double d,double o)
	{
		double y;
		double z;
		double w;
		y = o * PI / 360;
		z = (a + b + c + d) / 2;
		w = (z - a) * (z - b) * (z - c) * (z - d) - a * b * c * d * Math.cos(y) * Math.cos(y);
		if (w < 0)
		{
			return (-1);
		}
		else
		{
			return (double)Math.sqrt(w);
		}
	}
	public static void Main()
	{
		double t;
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
			o = Double.parseDouble(tempVar5);
		}
		t = s(a, b, c, d, o);
		if (t == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",t);
		}
	}

}

