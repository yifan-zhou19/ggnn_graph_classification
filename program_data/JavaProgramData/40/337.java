package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void mian(double a,double b,double c,double d,double e);
		double a;
		double b;
		double c;
		double d;
		double e;
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
			e = Double.parseDouble(tempVar5);
		}
		mian(a, b, c, d, e);
		return 0;
	}

	public static void mian(double a,double b,double c,double d,double e)
	{
		double s;
		s = (a + b + c + d) / 2;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * PI / 360) * Math.cos(e * PI / 360)) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * PI / 360) * Math.cos(e * PI / 360)));
		}
	}


}

