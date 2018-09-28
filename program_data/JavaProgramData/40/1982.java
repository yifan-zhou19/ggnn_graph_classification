package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double i;
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
			i = Double.parseDouble(tempVar5);
		}
		double s;
		double m;
		s = (a + b + c + d) / 2;
		double h = a * b * c * d * Math.cos(i * PI / 360) * Math.cos(i * PI / 360);
		m = (s - a) * (s - b) * (s - c) * (s - d) - h;
			if (m < 0)
			{
				System.out.print("Invalid input");
			}
			double S;
			if (m >= 0)
			{
			S = Math.sqrt(m);
		System.out.printf("%.4lf",S);
			}
		return 0;
	}

}

