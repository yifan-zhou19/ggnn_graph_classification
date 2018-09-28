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
		double g;
		double h;
		double i;
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
		i = e * PI / 180;
		s = (a + b + c + d) / 2;
		g = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(i / 2) * Math.cos(i / 2);
		h = Math.sqrt(g);
		if (e > 0 && e < 360)
		{
			if (g > 0)
			{
			  System.out.printf("%.4lf\n",h);
			}
			else
			{
				System.out.print("Invalid input");
			}
		}
		return 0;
	}

}

