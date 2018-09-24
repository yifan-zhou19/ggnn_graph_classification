package <missing>;

public class GlobalMembers
{
	//?????????

	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double real;
		double imaginary;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
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

			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else if ((b * b - 4 * a * c) == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=x2=%.5lf\n", x1);
			}
			else
			{
				imaginary = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
				real = (-b / (2 * a)) + 1 - 1;
				if (imaginary >= 0)
				{
					System.out.printf("x1=%.5lf+%.5lfi;", real, imaginary);
					System.out.printf("x2=%.5lf-%.5lfi\n", real, imaginary);
				}
				else
				{
					imaginary = (-imaginary);
					System.out.printf("x1=%.5lf-%.5lfi;", real, imaginary);
					System.out.printf("x2=%.5lf+%.5lfi\n", real, imaginary);
				}
			}
		}

		return 0;
	}
}

