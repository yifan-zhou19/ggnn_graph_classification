package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double pai = 3.1415926;
		double a;
		double b;
		double c;
		double d;
		double A;
		double s = 0;
		double h;
		double S;
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
			A = Double.parseDouble(tempVar5);
		}
		h = A / 180 * pai;
		s = (a + b + c + d) * 0.5;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(h / 2) * Math.cos(h / 2) >= 0.getValue() != 0)
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(h / 2) * Math.cos(h / 2));
			System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
	}
}

