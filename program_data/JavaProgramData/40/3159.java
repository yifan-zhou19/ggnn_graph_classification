package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s = 0.00;
		double n = 0.00;
		double m = 0.00;
		double j = 0.00;
		double k = 0.00;
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
		s = (a + b + c + d) / 2;
		k = Math.cos(m * 3.1415926 / 360) * Math.cos(m * 3.1415926 / 360);
		n = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * k;
		if (n < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			j = Math.sqrt(n);
		System.out.printf("%.4f",j);
		}
		return 0;
	}

}

