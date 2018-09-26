package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double angle)
	{
		double s;
		double k;
		double S;
		s = (a + b + c + d) / 2;
		k = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		if (k >= 0)
		{
			S = Math.sqrt(k);
		}
		else
		{
			S = -1;
		}
		return S;
	}
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
		double s;
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
		angle = angle / 360 * PI;
		s = area(a, b, c, d, angle);
		if (s == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",s);
		}
	}

}

