package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double m;
		double n;
		double x;
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
		x = m * pi / 360;
		n = Math.cos(x);
		s = (a + b + c + d) / 2;
		t = (s - a) * (s - b) * (s - c) * (s - d);
		if ((t - a * b * c * d * n * n) < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			S = Math.sqrt(t - a * b * c * d * n * n);
			System.out.printf("%.4lf",S);
		}
			return 0;
	}
}

