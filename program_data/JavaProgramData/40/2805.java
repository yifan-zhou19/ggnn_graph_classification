package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double jiaodu)
	{
		double s;
		double delta;
		double area;
		double t;
		t = PI * jiaodu / 360.0;
		s = (a + b + c + d) / 2;
		delta = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(t) * Math.cos(t);
		if (delta < 0)
		{
			return -1;
		}
		if (delta >= 0)
		{
			area = Math.sqrt(delta);
			return area;
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double jiaodu;
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
			jiaodu = Double.parseDouble(tempVar5);
		}
		if (area(a, b, c, d, jiaodu) == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",area(a, b, c, d, jiaodu));
		}
		return 0;
	}
}

