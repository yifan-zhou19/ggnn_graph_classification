package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double al;
		double af;
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
			al = Double.parseDouble(tempVar5);
		}
		af = al / 180 * pai;
		double s = 0.5 * (a + b + c + d);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(af / 2) * Math.cos(af / 2) >= 0.getValue() != 0)
		{
			double S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(af * 0.5) * Math.cos(af * 0.5));
			System.out.printf("%.4lf\n",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}
}

