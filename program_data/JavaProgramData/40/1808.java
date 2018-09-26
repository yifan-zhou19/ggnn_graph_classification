package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double square = new double(double a,double b,double c,double d,double angle);
		double a;
		double b;
		double c;
		double d;
		double angle;
		double s;
		double S;
		double ang;

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
		s = (a + b + c + d) / 2;
		ang = (angle / (double)360) * 3.1415926;
		{
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ang) * Math.cos(ang)) < 0)
		{
			System.out.print("Invalid input");
		}
			else
			{
	S = square(a, b, c, d, angle);
		System.out.printf("%.4lf",S);
			}
		}
	}
	public static double square(double a,double b,double c,double d,double angle)
	{
		double S;
		double s;
		double ang;
		s = (a + b + c + d) / 2;
		ang = (angle / (double)360) * 3.1415926;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ang) * Math.cos(ang));
	return (S);
	}
}

