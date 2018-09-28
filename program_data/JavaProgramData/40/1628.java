package <missing>;

public class GlobalMembers
{
	public static double f(double A)
	{
		double z;
		double PI;
		PI = 3.1415926;
		z = (double)Math.cos(A / 180 * PI);
		return (z);
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s;
		double A;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("""");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("""");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("""");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("""");
		if (tempVar5 != null)
		{
			A = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		S = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * f(A / 2) * f(A / 2);

		if (S < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",Math.sqrt(S));
		}
	}

}

