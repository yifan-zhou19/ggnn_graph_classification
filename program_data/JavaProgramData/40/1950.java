package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double c;
		double d;
		double e;
		double f;
		double g;
		double h;
		double i;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			e = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			f = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			g = Double.parseDouble(tempVar5);
		}
		i = (g / 360) * PI;
		s = (c + d + e + f) / 2.0;
		h = (s - f) * (s - e) * (s - c) * (s - d) - e * f * c * d * (Math.cos(i)) * (Math.cos(i)); //?????????

		if (h < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
		double a;
		double x2;
		double x1;
		a = h;
		x1 = 1;
		x2 = (x1 + a / x1) / 2.0;
		while (x2 - x1 > JINGDU || x1 - x2 > JINGDU)
		{
			x1 = x2;
			x2 = (x1 + a / x1) / 2.0;
		}
		System.out.printf("%.4f\n",x2);
		}
		return 0;
	}


}

