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
		double g;
		double x1;
		double x2;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
				d = (-b) / (2 * a);
				e = (Math.sqrt(Math.abs(4 * a * c - b * b))) / (2 * a);
				g = (Math.sqrt(Math.abs(4 * a * c - b * b))) / (2 * a);
		if ((b * b - 4 * a * c) > 0)
		{
			x1 = d + e;
			x2 = d - g;
				System.out.printf("x1=%.5lf;",x1);
				System.out.printf("x2=%.5lf\n",x2);
		}
		else if ((b * b - 4 * a * c) == 0)
		{
				x1 = x2 = d;
				System.out.printf("x1=x2=%.5lf\n",d);
		}
		else if ((4 * a * c - b * b) > 0)
		{
				System.out.printf("x1=%.5lf+%.5lfi;",d,e);
				System.out.printf("x2=%.5lf-%.5lfi\n",d,g);
		}
		}
		return 0;
	}
}

