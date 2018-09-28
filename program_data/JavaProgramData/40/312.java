package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s;
		double S;
		double e;
		double x;
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
			x = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		e = Math.cos(x / 720 * 2 * PI);
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * e * e);
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * e * e) < 0)
		{
		System.out.print("Invalid input\n");
		}
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * e * e) >= 0)
		{
		System.out.printf("%.4lf\n",S);
		}
		return 1;
	}
}

