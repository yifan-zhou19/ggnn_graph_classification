package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double af;
		double s;
		double S;

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
			af = Double.parseDouble(tempVar5);
		}

		s = (a + b + c + d) / 2;
		af = Math.cos(af / 180 * 3.1415926 / 2);
		S = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * af * af;

		if (S < 0)
		{
		  System.out.print("Invalid input\n");
		}
		else
		{
		  System.out.printf("%.4lf\n",Math.sqrt(S));
		}

		return 0;
	}
}

