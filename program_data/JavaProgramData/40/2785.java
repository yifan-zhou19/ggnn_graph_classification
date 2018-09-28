package <missing>;

public class GlobalMembers
{
	public static void S(double a,double b,double c,double d,double angle)
	{
		double s;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle * PI / 360) * Math.cos(angle * PI / 360) >= 0.getValue() != 0)
		{
			System.out.printf("%.4lf",Math.pow(((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle * PI / 360) * Math.cos(angle * PI / 360)),0.5));
		}
		else
		{
			System.out.print("Invalid input");
		}

	}

	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
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
			angle = Double.parseDouble(tempVar5);
		}
		S(a, b, c, d, angle);
	}

}

