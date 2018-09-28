package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double p;
		double S;
		double m;
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
			m = Double.parseDouble(tempVar5);
		}
		p = (a + b + c + d) / 2;
		m = m * 3.1415926 / 180;

		 if ((p - a) * (p - b) * (p - c) * (p - d) - a * b * c * d * (Math.cos(m)) * (Math.cos(m)) < 0.getValue() != 0)
		 {
			System.out.print("Invalid input");
		 }
		 else
		 {
			 S = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d) - a * b * c * d * (Math.cos(m / 2)) * (Math.cos(m / 2)));
		 System.out.printf("%.4lf",S);
		 }
		return 0;
	}

}

