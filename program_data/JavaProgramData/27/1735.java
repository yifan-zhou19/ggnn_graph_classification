package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double x1;
	public static double x2;
	public static double d;
	public static int n;
	public static int i;

	public static double test(double p)
	{
		if ((p - 0 < 0.000000001) && (0 - p < 0.000000001))
		{
			return 0;
		}
		else
		{
			return p;
		}
	}

	public static void doit()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		d = b * b - 4 * a * c;
		d = test(d);
		if ((d - 0 < 0.000000001) && (0 - d < 0.000000001))
		{
			x1 = -b / (2 * a);
			x1 = test(x1);
			System.out.printf("x1=x2=%.5f\n",x1);
			return;
		}
		if (d > 0)
		{
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x1 = test(x1);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			return;
		}
		if (d < 0)
		{
			x1 = -b / (2 * a);
			x1 = test(x1);
			x2 = Math.sqrt(-d) / (2 * a);
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x1,x2,x1,x2);
			return;
		}
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			doit();
		}
		return 0;
	}

}

