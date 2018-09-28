package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double S;
		double n;
		double m;
		double square = new double(double a,double b,double c,double d,double n);
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
			 n = Math.cos((m * 3.1415926) / 360);
		S = square(a, b, c, d, n);
		if (S >= 0)
		{
		System.out.printf("%.4lf\n",S);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
		return 0;
	}
	public static double square(double a,double b,double c,double d,double n)
	{
		double s;
		double S;
		s = (a + b + c + d) / 2;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * n * n);
			return (S);
	}


}

