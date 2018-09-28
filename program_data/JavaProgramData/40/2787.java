package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double jiao)
	{
		double result;
		double hu;
		double s;
		double panduan;
		hu = jiao / 180 * PI / 2;
		s = (a + b + c + d) / 2;
		panduan = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(hu) * Math.cos(hu);
		if (panduan < 0)
		{
			result = -1;
		}
		else
		{
			result = Math.sqrt(panduan);
		}
		return result;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double jiao;
		double shuchu;
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
			jiao = Double.parseDouble(tempVar5);
		}
		shuchu = mianji(a, b, c, d, jiao);
		if (shuchu == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",shuchu);
		}
		return 0;
	}
}

