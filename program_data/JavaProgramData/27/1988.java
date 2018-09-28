package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		double x1i;
		double x2i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
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
			if (b * b - 4 * a * c > 0)
			{
					x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					System.out.printf("x1=%.5lf;",x1);
					System.out.printf("x2=%.5lf\n",x2);
			}
			else if (b * b - 4 * a * c == 0)
			{
					x1 = -b / (2 * a);
					System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
					x1 = -b / (2 * a);
					x1i = Math.sqrt(4 * a * c - b * b) / (2 * a);
					x2 = -b / (2 * a);
					x2i = -Math.sqrt(4 * a * c - b * b) / (2 * a);
					if (b / (2 * a) == 0)
					{
							x1 = 0;
							x2 = 0;
					}
					System.out.printf("x1=%.5lf+%.5lfi;",x1,x1i);
					System.out.printf("x2=%.5lf%.5lfi\n",x2,x2i);
			}
			m++;
		}while (m < n);
			return 0;
	}
}

