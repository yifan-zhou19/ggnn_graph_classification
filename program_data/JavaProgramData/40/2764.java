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
		double k;

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
		s = (a + b + c + d) / 2.0;
		af = Math.cos(af / 2.0 * 3.1415926 / 180.0);
		k = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * af * af;
		if (k < 0)
		{
		  System.out.print("Invalid input\n");
		}
		else
		{
			S = Math.sqrt(k), System.out.printf("%.4lf\n",S);
		}
	 return 0;
	}

}

