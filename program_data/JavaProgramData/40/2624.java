package <missing>;

public class GlobalMembers
{
	public static double Main()
	{
		double a;
		double b;
		double c;
		double d;
		double w;
		double u;
		double s;
		double m;
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
			w = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		q = w / 2 / 180 * pi;
		 u = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q);
		 if (u > 0)
		 {
		m = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q));
		System.out.printf("%.4f",m);
		 }
		 else
		 {
			 System.out.print("Invalid input");
		 }
		return 0;
	}



}

