package <missing>;

public class GlobalMembers
{
	public static double s(double a,double b,double c,double d,double r)
	{
		double result;
		result = ((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(3.1415926 / 180 * r / 2) * Math.cos(3.1415926 / 180 * r / 2);
		if (result >= 0)
		{
		result = Math.sqrt(((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(3.1415926 / 180 * r / 2) * Math.cos(3.1415926 / 180 * r / 2));
		}
		return result;
	}
	public static int Main()
	{
		double mj;
		double a;
		double b;
		double c;
		double d;
		double r;
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
			r = Double.parseDouble(tempVar5);
		}
		mj = s(a, b, c, d, r);
		if (mj >= 0)
		{
			System.out.printf("%.4lf",mj);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

