package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double t;
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double S;
		double p = 3.1415926;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		s = (double)1 / 2 * (a + b + c + d);
		S = (double)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos((e / 360) * p)) * (Math.cos((e / 360) * p)));
		t = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((e / 360) * p) * Math.cos((e / 360) * p));
		if (t < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",S);
		}
	}
}

