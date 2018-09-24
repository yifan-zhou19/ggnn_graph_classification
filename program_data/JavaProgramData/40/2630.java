package <missing>;

public class GlobalMembers
{
	// ????????????.cpp : ??????????????
	//


	public static int Main()
	{ //declaration
		double a;
		double b;
		double c;
		double d;
		double s;
		double S;
		double angle2;
		double angle;
		double S2;
		final double Pi = 3.1415926;
	//input
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
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			angle2 = Double.parseDouble(tempVar5);
		}
	//process
		angle = angle2 / 2 * 2 * Pi / 360;
		s = (a + b + c + d) / 2;
		S2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		if (S2 > 0)
		{
			System.out.printf("%.4f",Math.sqrt(S2));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}


}

