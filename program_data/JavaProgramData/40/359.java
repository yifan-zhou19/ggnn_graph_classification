package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double m;
		double S;
		double s;
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
			x = Double.parseDouble(tempVar5);
		}
		m = PI / 180 * x / 2;
		s = 1 * (a + b + c + d) / 2;
		S = (sqrt)((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m));

		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m) >= 0.getValue() != 0)
		{
		System.out.printf("%.4f\n",S);
		}
		else
		{
		System.out.printf("Invalid input\n",S);
		}
		return 0;
	}
}

