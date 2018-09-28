package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			delta = b * b - 4 * a * c;
			if (delta < 0)
			{
				delta = Math.sqrt(-delta) / 2 / a;
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n", -b / 2 / a, delta, -b / 2 / a, -delta);
			}
			else if (delta > 0)
			{
				delta = Math.sqrt(delta) / 2 / a;
				System.out.printf("x1=%.5lf;x2=%.5lf\n", -b / 2 / a + delta, -b / 2 / a - delta);
			}
			else
			{
				System.out.printf("x1=x2=%.5lf\n", -b / a / 2);
			}
		}
	}
}

