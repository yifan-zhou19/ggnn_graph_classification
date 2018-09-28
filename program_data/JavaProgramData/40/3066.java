package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double p;
		double q;
		double s;
		double x;
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
			p = Double.parseDouble(tempVar5);
		}
		q = 2 * 3.1415926 * p / 720;
		x = (a + b + c - d) * (a + b - c + d) * (a - b + c + d) * (-a + b + c + d) / 16 - a * b * c * d * Math.pow(Math.cos(q),2);
		if (x < 0)
		{
				System.out.print("Invalid input");
		}
		if (x >= 0)
		{
				 s = Math.sqrt(x);
				 System.out.printf("%.4lf", s);
		}
		return 0;
	}

}

