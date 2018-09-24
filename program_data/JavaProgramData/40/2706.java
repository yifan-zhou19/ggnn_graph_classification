package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double alf2;
		double mj;
		double Squ = new double(double a1,double b1,double c1,double d1,double alf21);
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
			alf2 = Double.parseDouble(tempVar5);
		}
		mj = Squ(a, b, c, d, alf2);
		if (mj < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4lf\n",mj);
		}
		return 0;
	}
	public static double Squ(double a1,double b1,double c1,double d1,double alf21)
	{
		double s;
		double S;
		double alf;
		s = (a1 + b1 + c1 + d1) / 2;
		alf = alf21 / 360 * 3.1415926;

		if (((s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * Math.pow(Math.cos(alf),2)) >= 0)
		{
			S = Math.sqrt((s - a1) * (s - b1) * (s - c1) * (s - d1) - a1 * b1 * c1 * d1 * Math.pow(Math.cos(alf),2));

		}
		else
		{
			S = -1;
		}
	   return S;
	}

}

