package <missing>;

public class GlobalMembers
{
	public static double s;
	public static double final;
	public static void Main()
	{
			double a;
			double b;
			double c;
			double d;
			double aa;
			void four(double,double,double,double,double,double);
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
				aa = Double.parseDouble(tempVar5);
			}
			s = (a + b + c + d) / 2;
			aa = aa / 360 * 3.1415926;
			four(a, b, c, d, s, aa);


	}

	public static void four(double a,double b,double c,double d,double ss, double angle)
	{
			double w;
			w = (ss - a) * (ss - b) * (ss - c) * (ss - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
			if (w < 0)
			{
				System.out.print("Invalid input");
			}
			else
			{
				System.out.printf("%.4lf",Math.sqrt(w));
			}

	}
}

