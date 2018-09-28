package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double du;
		double s;
		double t;
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
			du = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(du * 3.1415926 / 360) * Math.cos(du * 3.1415926 / 360);
		if (t < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",Math.sqrt(t));
		}
		return 0;
	}
}

