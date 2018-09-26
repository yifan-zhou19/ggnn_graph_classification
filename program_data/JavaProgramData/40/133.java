package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double n = 0;
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
			n = Double.parseDouble(tempVar5);
		}
	double s = 1.0 / 2 * (a + b + c + d);
	double g = n / 360 * PI;
	double f = Math.cos(g);
	double S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f * f);
	if ((s - a) * (s - b) * (s - c) * (s - d) < 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
		System.out.printf("%.4f",S);
	};
	}

}

