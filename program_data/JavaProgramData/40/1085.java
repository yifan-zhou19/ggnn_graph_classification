package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double m;
		double s;
		double S;
		double t;
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
			m = Double.parseDouble(tempVar5);
		}
		m = m / 360 * pi;
		s = (a + b + c + d) / 2;
		t = Math.cos(m) * Math.cos(m);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * t < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * t);
			System.out.printf("%.4lf\n",S);
		}
	}

}

