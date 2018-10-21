package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double O)
	{
		double S;
		double s;
		s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(O) * Math.cos(O) >= 0.getValue() != 0)
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(O) * Math.cos(O));
		}
		else
		{
			S = -1;
		}
		return S;
	}

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double o;
		double O;
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
			o = Double.parseDouble(tempVar5);
		}
		O = 2 * PI * (o / 2) / 360;
		if (mianji(a, b, c, d, O) == -1)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",mianji(a, b, c, d, O));
		}
	}
}

