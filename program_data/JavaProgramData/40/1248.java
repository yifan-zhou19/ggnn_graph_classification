package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
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
		double s;
		double f;
		double S;
		s = (a + b + c + d) / 2.0;
		f = Math.cos(e / 2 / 180.0 * 3.1415926) * Math.cos(e / 2 / 180.0 * 3.1415926);
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f > 0)
		{
		System.out.printf("%.4lf",S);
		}
		  else
		  {
			  System.out.print("Invalid input");
		  }
		return 0;
	}
}

