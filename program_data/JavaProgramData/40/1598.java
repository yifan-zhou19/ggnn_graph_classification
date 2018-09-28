package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double S;
		double s;
		double PI = 3.1415926;
		double E;
		double A;
		double B;
		double C;
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
			e = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		E = (e / 2) * (PI / 180);
		A = (s - a) * (s - b) * (s - c) * (s - d);
		B = Math.cos(E) * Math.cos(E) * a * b * c * d;
		C = A - B;
		if (C < 0)
		{
			System.out.print("Invalid input\n");
		}
		if (C >= 0)
		{
			S = Math.sqrt(C);
			System.out.printf("%.4lf\n",S);
		}
	}



}

