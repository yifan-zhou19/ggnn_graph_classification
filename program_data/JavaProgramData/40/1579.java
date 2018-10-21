package <missing>;

public class GlobalMembers
{
	public static double compute(double a,double b,double c,double d,double sum)
	{
		double mianji = 0;
		double s = (a + b + c + d) / 2;
		double hudu = sum * PI / 360;
		mianji = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(hudu) * Math.cos(hudu);
		if (mianji >= 0)
		{
			mianji = Math.sqrt(mianji);
		}
		return mianji;
	}

	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double sum;
		double v;

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
			sum = Double.parseDouble(tempVar5);
		}
		v = compute(a, b, c, d, sum);
		if (v < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",v);
		}
	}
}

