package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double sum;
		double hudu;
		double s;
		double pi = 3.1415926;
		double m;

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
			sum = Double.parseDouble(tempVar5);
		}
		m = 1.0 / 2 * (a + b + c + d);
		hudu = sum * pi / 180;

		if ((m - a) * (m - b) * (m - c) * (m - d) - a * b * c * d * Math.cos(hudu / 2) * Math.cos(hudu / 2) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
			return 0;
		}
		else
		{
			s = Math.sqrt((m - a) * (m - b) * (m - c) * (m - d) - a * b * c * d * Math.cos(hudu / 2) * Math.cos(hudu / 2));
		}
		System.out.printf("%.4lf\n",s);
		return 0;
	}
}

