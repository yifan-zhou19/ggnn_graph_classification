package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		double s = 0;
		double S = 0;
		double q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		s = 0.5 * (a + b + c + d);
		f = PI * e / 180;
		q = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(0.5 * f),2);
		if (q >= 0)
		{
			S = Math.sqrt(q);
			System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

