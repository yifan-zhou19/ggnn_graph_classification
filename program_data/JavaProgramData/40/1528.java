package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double e)
	{
		double S;
	double s = (a + b + c + d) / 2;

	double t = (e / 180) * PI;
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t / 2) * Math.cos(t / 2));
	return S;
	}

	public static int Main()
	{
		double n;
		double a;
		double b;
		double c;
		double d;
		double e;
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
			e = Double.parseDouble(tempVar5);
		}

		s = (a + b + c + d) / 2;
		t = (e / 180) * PI;
	  if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t / 2) * Math.cos(t / 2) >= 0.getValue() != 0)
	  {
		 n = mianji(a, b, c, d, e);
		System.out.printf("%.4lf",n);
	  }
	else if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t / 2) * Math.cos(t / 2) < 0)
	{
		System.out.print("Invalid input");
	}
	return 0;
	}
}

