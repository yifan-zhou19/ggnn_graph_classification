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

		for (int i = 0; i < n; ++i)
		{
			double a;
			double b;
			double c;
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
			double delta = b * b - 4 * a * c;

			double x1;
			double x2;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				if (x1 == 0.0)
				{
					x1 = 0.0;
				}
				if (x2 == 0.0)
				{
					x2 = 0.0;
				}

				System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else if (delta == 0)
			{
				x1 = -b / (2 * a);
				if (x1 == 0.0)
				{
					x1 = 0.0;
				}
				System.out.printf("x1=x2=%.5lf\n", x1);
			}
			else
			{
				double real;
				double imag;
				real = -b / (2 * a);
				if (real == 0.0)
				{
					real = 0.0;
				}
				imag = Math.sqrt(-delta) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", real, imag, real, imag);
			}
		}
	}

}

