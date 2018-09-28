package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s;
		double ds;
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
		e = (double)e * 3.1415926 / 180;
		e = (double)e / 2;
		s = (double)(a + b + c + d) / 2;
		ds = (double)((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e));
		if (ds < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			ds = Math.sqrt(ds);
			System.out.printf("%.4lf",ds);
		}
		return 0;
	}

}

