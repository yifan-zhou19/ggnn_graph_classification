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
		double f;
		double g;
		double h;
		double i;
		double l;

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
			g = Double.parseDouble(tempVar5);
		}
		0 < g < 360;
		l = PI * g / 180 / 2;
		e = (a + b + c + d) / 2;
		h = Math.pow(Math.cos(l),2);
		i = (e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * h;
		if (i < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			f = Math.sqrt((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * h);

		System.out.printf("%.4lf\n",f);
		}

		return 0;
	}
}

