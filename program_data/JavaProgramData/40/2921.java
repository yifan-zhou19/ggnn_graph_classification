package <missing>;

public class GlobalMembers
{
	public static double sqare(double a, double b, double c, double d, double angle)
	{
		double sq;
		double s;
		double alfa;
		alfa = PI * angle / 360;
		s = (a + b + c + d) / 2;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(alfa),2)) < 0)
		{
			return -1;
		}
		else
		{
			sq = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(alfa),2));
			return sq;
		}
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
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
		double s = sqare(a, b, c, d, angle);
		if (sqare(a, b, c, d, angle) == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",s);
		}
	}

}

