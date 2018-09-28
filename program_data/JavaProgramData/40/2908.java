package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double alpha)
	{
		double jiao;
		double s;
		double S;
		double S2;
		jiao = alpha / 180 * PI / 2;
		s = (a + b + c + d) / 2;
		S2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(jiao) * Math.cos(jiao);
		if (S2 < 0)
		{
		return 0;
		}
		else
		{
		S = Math.sqrt(S2);
		return S;
		}
	}
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double alpha;
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
			alpha = Double.parseDouble(tempVar5);
		}
		if (mianji(a, b, c, d, alpha) == 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",mianji(a, b, c, d, alpha));
		}
	}
}

