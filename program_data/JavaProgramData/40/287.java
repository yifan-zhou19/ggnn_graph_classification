package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double a;
		double b;
		double c;
		double d;
		double o;
		double S;
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
		s = 1.0 / 2.0 * (a + b + c + d);
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o * 3.1415926 / 180 / 2) * Math.cos(o * 3.1415926 / 180 / 2)) < 0)
		{
			System.out.print("Invalid input");
		return 0;
		}
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(o * 3.1415926 / 180 / 2) * Math.cos(o * 3.1415926 / 180 / 2));
		System.out.printf("%.4lf\n",S);
		return 0;
	}




}

