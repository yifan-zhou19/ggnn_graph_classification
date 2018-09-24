package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		int jiaohe;
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
			jiaohe = Integer.parseInt(tempVar5);
		}
		if (((0.5 * (a + b + c + d) - a) * (0.5 * (a + b + c + d) - b) * (0.5 * (a + b + c + d) - c) * (0.5 * (a + b + c + d) - d) - a * b * c * d * Math.cos(((double)jiaohe / 180 / 2) * 3.1415926) * Math.cos(((double)jiaohe / 180 / 2) * 3.1415926)) < 0)
		{
			System.out.print("Invalid input");
		}
		if (((0.5 * (a + b + c + d) - a) * (0.5 * (a + b + c + d) - b) * (0.5 * (a + b + c + d) - c) * (0.5 * (a + b + c + d) - d) - a * b * c * d * Math.cos(((double)jiaohe / 180 / 2) * 3.1415926) * Math.cos(((double)jiaohe / 180 / 2) * 3.1415926)) > 0)
		{
			System.out.printf("%.4lf\n", Math.sqrt((0.5 * (a + b + c + d) - a) * (0.5 * (a + b + c + d) - b) * (0.5 * (a + b + c + d) - c) * (0.5 * (a + b + c + d) - d) - a * b * c * d * Math.cos(((double)jiaohe / 180 / 2) * 3.1415926) * Math.cos(((double)jiaohe / 180 / 2) * 3.1415926)));
		}
	}


}

