package <missing>;

public class GlobalMembers
{
	public static void jisuan(double a,double b,double c,double d,double hudu)
	{
		double s;
		double h;
		double mianji;
		s = (a + b + c + d) / 2;
		h = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(hudu) * Math.cos(hudu);
		if (h < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			mianji = Math.sqrt(h);
		System.out.printf("%.4lf",mianji);
		}
	}
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double jiaodu;
		double s;
		double hudu;
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
			jiaodu = Double.parseDouble(tempVar5);
		}
		hudu = jiaodu / 2 * 3.1415926 / 180;
		jisuan(a, b, c, d, hudu);
	}

}

