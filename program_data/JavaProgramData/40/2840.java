package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double S;
		double a;
		double b;
		double c;
		double d;
		double A;
		double aerfa;
		double kaifang = new double(double a,double b,double c,double d,double aerfa);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			A = Double.parseDouble(tempVar5);
		}
		aerfa = A / 180 * PI / 2;
		s = (a + b + c + d) / 2;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(aerfa) * Math.cos(aerfa)) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = kaifang(a, b, c, d, aerfa);
			System.out.printf("%.4lf\n",S);
		}
		return 0;
	}

	public static double kaifang(double a,double b,double c,double d,double aerfa)
	{
		double s;
		double S;
		s = (a + b + c + d) / 2;
		while (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(aerfa) * Math.cos(aerfa)) >= 0)
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(aerfa) * Math.cos(aerfa));
			break;
		}
		return S;
	}

}

