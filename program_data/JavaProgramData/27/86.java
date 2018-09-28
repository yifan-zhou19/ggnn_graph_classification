package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		double delta;
		double real1;
		double real2;
		double i1;
		double i2;
		double x1;
		double x2;
		int zero = double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
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
			if (zero(delta) == 1)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
	//			if (!zero(x1)) x1 = 0; 
	//			if (!zero(x2)) x2 = 0;
				System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else if (zero(delta) == 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
	//			if (!zero(x1)) x1 = 0;
				System.out.printf("x1=x2=%.5lf\n", x1);
			}
			else
			{
				delta = -delta;
				real1 = -b / (2 * a);
				real2 = -b / (2 * a);
				i1 = Math.sqrt(delta) / (2 * a);
				i2 = Math.sqrt(delta) / (2 * a);
	//			if (!zero(real1)) real1 = 0;
	//			if (!zero(real2)) real2 = 0;
	//			if (!zero(i1)) i1 = 0;
	//			if (!zero(i2)) i2 = 0;
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", real1, i1, real2, i2);
			}
			n--;
		}
		return 0;
	}
	public static int zero(double a)
	{
		if (Math.abs(a) > 1e-6)
		{
			if (a > 0)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return 0;
		}
	}
}

