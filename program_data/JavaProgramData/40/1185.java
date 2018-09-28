package <missing>;

public class GlobalMembers
{
	public static double getarea(double a, double B, double c, double d, double e)
	{
		double area;
		double s;
		s = (a + B + c + d) / 2;

		if ((s - a) * (s - B) * (s - c) * (s - d) - a * B * c * d * Math.cos(e / 360 * 3.1415926) * Math.cos(e / 360 * 3.1415926) >= 0.getValue() != 0)
		{
			area = Math.sqrt((s - a) * (s - B) * (s - c) * (s - d) - a * B * c * d * Math.cos(e / 360 * 3.1415926) * Math.cos(e / 360 * 3.1415926));
		}
		else
		{
			area = -1;
		}
		return area;
	}
	public static int Main()
	{
		double a;
		double B;
		double c;
		double d;
		double e;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = Double.parseDouble(tempVar2);
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
		f = getarea(a, B, c, d, e);
		if (f == -1)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",f);
		}
		return 0;
	}


}

