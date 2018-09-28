package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double tah;
		double s;
		double tot;
		double tahc;
		int ta;
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
			ta = Integer.parseInt(tempVar5);
		}
		tah = ((double)ta) / 360 * PI;
		s = 0.5 * (a + b + c + d);
		tahc = Math.cos(tah);
		tot = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * tahc * tahc;
		if (tot >= 0)
		{
			System.out.printf("%.4lf",Math.sqrt(tot));
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

