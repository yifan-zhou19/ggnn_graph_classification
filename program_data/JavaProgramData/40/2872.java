package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double square = new double(double x,double y,double z,double w,double m);
		double S;
		double a;
		double b;
		double c;
		double d;
		double M;
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
			M = Double.parseDouble(tempVar5);
		}
		S = square(a, b, c, d, M);
		if (S > 0)
		{
			System.out.printf("%.4lf",Math.sqrt(S));
		}
		else
		{
			System.out.print("Invalid input");
		}
	}

	public static double square(double x,double y,double z,double w,double m)
	{
		double k;
		double SQUARE;
		k = (x + y + z + w) / 2;
		double p;
		double q;
		p = (k - x) * (k - y) * (k - z) * (k - w);
			 double hudu;
		hudu = PI * m / 180;
		q = x * y * z * w * Math.cos(hudu / 2) * Math.cos(hudu / 2);
		SQUARE = p - q;
		return SQUARE;
	}
}

