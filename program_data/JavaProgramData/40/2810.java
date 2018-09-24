package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double area = new double(double a,double b,double c,double d,double alpha);
		double a;
		double b;
		double c;
		double d;
		double alpha;
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
			alpha = Double.parseDouble(tempVar5);
		}
		if ((alpha > 0) && (alpha < 360) && (area(a, b, c, d, alpha)>0))
		{
			System.out.printf("%.4f",area(a, b, c, d, alpha));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}
	public static double area(double a,double b,double c,double d,double alpha)
	{
		   double S;
		   double s;
		   s = (a + b + c + d) / 2;
		   S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha / 360 * PI) * Math.cos(alpha / 360 * PI));
		   return (S);
	}
}

