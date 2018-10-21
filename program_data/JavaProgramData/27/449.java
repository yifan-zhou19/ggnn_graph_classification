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
		double h;
		double j;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			d = b * b - 4 * a * c;
			e = -b / (2 * a);
			f = 0 - e;
			g = Math.sqrt(4 * a * c - b * b) / (2 * a);
			h = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			j = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			if (d == 0.0)
			{
				System.out.printf("x1=x2=%.5lf\n",e);
			}
			if (d < 0.0 && b != 0)
			{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,g,e,g);
			}
			if (d < 0.0 && b == 0)
			{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",f,g,f,g);
			}

			if (d > 0.0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",h,j);
			}
		}
		return 0;
	}
}

