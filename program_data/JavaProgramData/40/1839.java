package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double sq = new double(double w,double x,double y,double z,double v);
		double b;
		double c;
		double d;
		double e;
		double a;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			e = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a = Double.parseDouble(tempVar5);
		}
		System.out.print("\n");
		s = sq(b, c, d, e, a);
		if (s > 0)
		{
			System.out.printf("%.4lf",s);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
	}

		public static double sq(double w,double x,double y,double z,double v)
		{
			double u;
			double q;
			double r;
			double t;
			q = (v / (double)(360)) * 3.1415926;
			r = Math.cos(q);
			t = (w + x + y + z) / 2;
			if (((t - w) * (t - x) * (t - y) * (t - z) - w * x * y * z * r * r) > 0)
			{
				u = Math.sqrt((t - w) * (t - x) * (t - y) * (t - z) - w * x * y * z * r * r);
			}
			else
			{
				u = 0;
			}
			return (u);
		}



}

