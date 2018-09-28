package <missing>;

public class GlobalMembers
{
	public static double s(double a,double b,double c,double d,double q)
	{
		double area;
		double k;
		double w;
		double i;
		w = (a + b + c + d) / 2;
		k = q * 0.5 * 3.1415926 / 180;
		i = (w - a) * (w - b) * (w - c) * (w - d) - a * b * c * d * Math.cos(k) * Math.cos(k);
		if (i < 0)
		{
			area = -1;
		}
		else
		{
			area = Math.sqrt(i);
		}
		return (area);
	}
	public static int Main()
	{
		double s = new double(double a,double b,double c,double d,double q);
		double a;
		double b;
		double c;
		double d;
		double q;
		double k;
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
			q = Double.parseDouble(tempVar5);
		}
		k = s(a, b, c, d, q);
		if (k < 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4lf",k);
		}
	}



}

