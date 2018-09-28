package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double e)
	{
		double s;
		double q;
		double S;
		s = (a + b + c + d) / (2.0);
		q = Math.cos(e * (3.1415926) / (180.0) / (2.0));
			return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * q * q);
	}
	public static int Main()
	{
		double n1;
		double n2;
		double n3;
		double n4;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n3 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n4 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Double.parseDouble(tempVar5);
		}
		if (area(n1, n2, n3, n4, m) >= 0)
		{
			System.out.printf("%.4lf",area(n1, n2, n3, n4, m));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}



}

