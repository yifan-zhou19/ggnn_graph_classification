package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
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
		double hh;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			hh = Double.parseDouble(tempVar5);
		}
		double s;
		s = (a + b + c + d) / 2;
		hh = hh / 360 * 3.141592;
		hh = Math.cos(hh);
		double S;
		double SS = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * hh * hh;
		if (SS < 0)
		{
			System.out.print("Invalid input");
			return 0;
		}
		S = Math.sqrt(SS);
		System.out.printf("%0.4lf",S);
		return 0;

	}

}

