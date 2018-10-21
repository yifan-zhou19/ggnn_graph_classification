package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
		double shi1;
		double xu1;
		double shi2;
		double xu2;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			delta = b * b - 4 * a * c;
			if (delta >= 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				if (x1 != x2)
				{
				System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
				}
				if (x1 == x2)
				{
				System.out.printf("x1=x2=%.5lf\n", x2);
				}
			}
			if (delta < 0)
			{
				shi1 = shi2 = -b / (2 * a);
				xu1 = Math.sqrt(-delta) / (2 * a);
				xu2 = -Math.sqrt(-delta) / (2 * a);
				System.out.printf("x1=%.5lf", shi1);
				if (xu1 > 0)
				{
				System.out.printf("+%.5lfi", xu1);
				}
				if (xu1 < 0)
				{
				System.out.printf("%.5lfi", xu1);
				}
				System.out.printf(";x2=%.5lf", shi2);
				if (xu2 > 0)
				{
				System.out.printf("+%.5lfi", xu2);
				}
				if (xu2 < 0)
				{
				System.out.printf("%.5lfi\n", xu2);
				}
			}
		}

		return 0;
	}
}

