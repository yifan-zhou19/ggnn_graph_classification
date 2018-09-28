package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double n)
	{
		double w;
		double m;
		double s;
		m = n * 3.1415926 / 360.0;
		s = (a + b + c + d) / 2;
		w = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m) * Math.cos(m);

			return (w);
	}

	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double n;
		double e;
		double q;

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

		e = mianji(a, b, c, d, n);

		 if (e > 0)
		 {
				q = Math.sqrt(e);
			System.out.printf("%.4lf\n",q);
		 }
		else
		{
			System.out.print("Invalid input\n");
		}

	}



}

