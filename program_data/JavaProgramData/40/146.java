package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double v;
		double s;
		double S;
		double P;
		P = 3.1415926;
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
			v = Double.parseDouble(tempVar5);
		}
		s = (double)1 / 2 * (a + b + c + d);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(v * P / 360) < 0) //CXX0017: Error: symbol "cos" not found
		{

			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(v * P / 360) * Math.cos(v * P / 360));
			System.out.printf("%.4f",S);
		}
		return 0;
	}

}

