package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double squart = new double(double a,double b,double c,double d,double e);
		double x1;
		double x2;
		double x3;
		double x4;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x2 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x3 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x4 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Double.parseDouble(tempVar5);
		}
		double genhao;
		double s;
		double e1;
		double sum;
		s = (x1 + x2 + x3 + x4) / 2;
		e1 = y * pi / 360;
		genhao = (s - x1) * (s - x2) * (s - x3) * (s - x4) - x1 * x2 * x3 * x4 * Math.cos(e1) * Math.cos(e1);
		if (genhao < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			sum = squart(x1, x2, x3, x4, y);
			System.out.printf("%.4lf",sum);
		}
		return 0;
	}
	public static double squart(double a,double b,double c,double d,double e)
	{
		double m;
		double s1;
		double n;
		n = e * pi / 360;
		s1 = (a + b + c + d) / 2;
		m = Math.sqrt((s1 - a) * (s1 - b) * (s1 - c) * (s1 - d) - a * b * c * d * Math.cos(n) * Math.cos(n));
		return m;
	}






}

