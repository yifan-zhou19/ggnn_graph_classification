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
				e = Double.parseDouble(tempVar5);
			}
			double n = (a + b + c + d) / 2;
			double p = Math.cos((e * 3.1415926) / 360);
			double m = (n - a) * (n - b) * (n - c) * (n - d);
		if (m < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
		  double S = Math.sqrt(m - (a * b * c * d * p * p));
			System.out.printf("%.4lf",S);
		}
			return 0;
	}

}

