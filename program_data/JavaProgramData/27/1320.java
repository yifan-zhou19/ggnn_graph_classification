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
		double f;
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
			d = b * b - 4 * a * c;
			if (d > 0)
			{
				if (b == 0)
				{
					x1 = (b + Math.sqrt(d)) / (2 * a);
					x2 = (b - Math.sqrt(d)) / (2 * a);
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}
				else
				{
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}

			}
			else if (d == 0)
			{
				x1 = (-b) / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				if (b == 0)
				{
					e = -d;
				f = Math.sqrt(e) / (2 * a);
				g = (-b) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",g,f,g,f);
				}
				else
				{

				e = -d;
				f = Math.sqrt(e) / (2 * a);
				g = (-b) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",g,f,g,f);
				}
			}
		}
		return 0;
	}
}

