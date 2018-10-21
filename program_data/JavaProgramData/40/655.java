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
		double S;
		double A;
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
			i = Double.parseDouble(tempVar5);
		}
		A = (1.0 / 2 * (a + b + c + d) - a) * (1.0 / 2 * (a + b + c + d) - b) * (1.0 / 2 * (a + b + c + d) - c) * (1.0 / 2 * (a + b + c + d) - d) - a * b * c * d * (Math.cos(PI * i / 360)) * (Math.cos(PI * i / 360));
		if (A > 0)
		{
			S = Math.sqrt((1.0 / 2 * (a + b + c + d) - a) * (1.0 / 2 * (a + b + c + d) - b) * (1.0 / 2 * (a + b + c + d) - c) * (1.0 / 2 * (a + b + c + d) - d) - a * b * c * d * (Math.cos(PI * i / 360)) * (Math.cos(PI * i / 360)));
			System.out.printf("%.4lf",S);
		}
		if (A < 0)
		{
			System.out.print("Invalid input");
		}
			return 0;
	}

}

