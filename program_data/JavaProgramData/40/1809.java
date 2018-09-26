package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double area = new double(double a,double b,double c,double d,double m);
		double S;
		double s;
		double a;
		double b;
		double c;
		double d;
		double m;
		void print();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			m = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) < a * b * c * d * Math.cos(m * PI / 360) * Math.cos(m * PI / 360))
		{
			print();
		}

		else
		{
			S = area(a, b, c, d, m);
			System.out.printf("%.4lf",S);
		}
	}
	public static void print()
	{
		System.out.print("Invalid input");
	}
	public static double area(double a,double b,double c,double d,double m)
	{
		double S;
		double s;
		s = (a + b + c + d) / 2;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(m * PI / 360) * Math.cos(m * PI / 360));
		return (S);
	}
}

