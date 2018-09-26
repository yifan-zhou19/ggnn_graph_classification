package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		double a;
		double b;
		double c;
		double d;
		double t;
		double s;
		double f;
		double n;
		double x;
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
			t = Double.parseDouble(tempVar5);
		}
		s = (double) 1 / 2 * (a + b + c + d);
		n = (double)3.1415926 * 2 * t / 360;
		x = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (1 + Math.cos(n)) / 2;
		if (x >= 0)
		{
		f = (double) Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (1 + Math.cos(n)) / 2);
		System.out.printf("%.4lf",f);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

