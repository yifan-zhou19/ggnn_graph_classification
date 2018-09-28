package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double g;
		double s;
		f = 0,s = 0,g = 0;
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
			e = Double.parseDouble(tempVar5);
		}
		if (e > 0 && e < 360)
		{
			e = (e / 360) * 2 * (PI);
			s = (a + b + c + d) / 2;
			g = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2);
			f = Math.sqrt(g);
		}
		if (g < 0)
		{
			System.out.print("Invalid input\n");
		}
		else
		{
			System.out.printf("%.4f\n",f);
		}
		return 0;
	}
}

