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
		double s;
		double x;
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
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			x = Double.parseDouble(tempVar5);
		}
		e = a / 2 + b / 2 + c / 2 + d / 2;
		s = Math.sqrt((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * ((Math.cos(x / 180 * PI) + 1) / 2));
		if ((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * ((Math.cos(x / 180 * PI) + 1) / 2) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4lf",s);
		}
		return 0;
	}

}

