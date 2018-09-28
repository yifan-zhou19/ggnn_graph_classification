package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double p;
		double q;
		double s;
		double y;
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
			p = Double.parseDouble(tempVar5);
		}
		s = 0.5 * (a + b + c + d);
		q = 0.5 * p / 180 * 3.1415926;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q)) >= 0)
		{
			y = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q));
			System.out.printf("%.4lf\n",y);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
	}
}

