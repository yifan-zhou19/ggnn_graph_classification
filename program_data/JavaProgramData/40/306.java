package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double g;
		double h;
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
		s = 0.5 * (a + b + c + d);
		h = e / 360 * 3.1415926;
		f = Math.cos(h);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f * f < 0)
		{
			System.out.print("Invalid input\n");
		}

		else
		{
			g = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f * f);
		System.out.printf("%.4lf",g);
		}
	return 0;
	}

}

