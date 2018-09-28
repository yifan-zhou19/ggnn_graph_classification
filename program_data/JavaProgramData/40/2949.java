package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		double a;
		double b;
		double c;
		double d;
		double xs;
		double ds;
		double t;
		double p;
		double PI = 3.1415926;
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
		xs = (a + b + c + d) / 2;
		p = ((t / 2) / 180) * PI;
		if ((xs - a) * (xs - b) * (xs - c) * (xs - d) - a * b * c * d * Math.cos(p) * Math.cos(p) >= 0.getValue() != 0)
		{
			ds = Math.sqrt((xs - a) * (xs - b) * (xs - c) * (xs - d) - a * b * c * d * Math.cos(p) * Math.cos(p));
			System.out.printf("%.4lf\n",ds);
		}
		else
		{
		System.out.print("Invalid input\n");
		}
	}

}

