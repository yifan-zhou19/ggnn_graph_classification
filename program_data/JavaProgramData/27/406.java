package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double sb;
		double xb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
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
			if ((b * b - 4.0 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				x2 = (-b - Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1 + 1e-6,x2 + 1e-6);
			}
			else if (Math.abs(b * b - 4.0 * a * c) < 1e-8)
			{
				x1 = -b / (2.0 * a);
				System.out.printf("x1=x2=%.5lf\n",x1 + 1e-6);
			}
			else
			{
				sb = -b / (2.0 * a);
				xb = Math.sqrt(4.0 * a * c - b * b) / (2.0 * a);
				if (Math.abs(sb) < 1e-8)
				{
					sb = 0;
				}
				if (Math.abs(xb) < 1e-8)
				{
					xb = 0;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",sb,xb,sb,xb);
			}
		}
		return (0);
	}
}

