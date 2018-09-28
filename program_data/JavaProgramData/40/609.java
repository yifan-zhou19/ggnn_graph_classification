package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double m;
		double s;
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
			m = Double.parseDouble(tempVar5);
		}
		m = m / 360 * 3.1415926;
		s = 1.0 / 2 * (a + b + c + d);
		s = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m);
		if (s < 0)
		{
			System.out.print("Invalid input\n");
		}
			else
			{
				System.out.printf("%.4f\n", Math.sqrt(s));
			}
		return 0;
	}


}

