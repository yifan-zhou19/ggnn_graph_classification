package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double ang;
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
			ang = Double.parseDouble(tempVar5);
		}
		double rad = ang / 2 / 180 * 3.1415926;
		double s = (a + b + c + d) / 2;
		double gen = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(rad) * Math.cos(rad);
		if (gen < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(gen);
			System.out.printf("%.4f",S);
		}
	}
}

