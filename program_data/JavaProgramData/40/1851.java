package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double j;
		double J;
		double S;
		double s;
		double m;
		double pi = 3.1415926;
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
			j = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		J = j / 360 * pi;
		m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(J) * Math.cos(J);
		if (m > 0)
		{
			System.out.printf("%.4lf",Math.sqrt(m));
		}
		else
		{
			System.out.print("Invalid input");
		}
	}


}

