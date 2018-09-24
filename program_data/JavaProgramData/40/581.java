package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double v;
		double s;
		double S;
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
			v = Double.parseDouble(tempVar5);
		}
		s = (double)(a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(PI * v / 360) * Math.cos(PI * v / 360) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(PI * v / 360) * Math.cos(PI * v / 360));
		System.out.printf("%.4lf",S);
		}
	}

}

