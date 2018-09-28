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
		double t;
		double h;
		double s;
		double m;
		double z;
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
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			m = Double.parseDouble(tempVar5);
		}
		f = 3.1415926;
		e = (a + b + c + d) * 1.0 / 2;

		h = m * f / 360;

		t = a * b * c * d * Math.cos(h) * Math.cos(h);
		z = (e - a) * (e - b) * (e - c) * (e - d) - t;
		if (z > 0)
		{
		s = Math.sqrt((e - a) * (e - b) * (e - c) * (e - d) - t);
		System.out.printf("%.4lf\n",s);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}





}

