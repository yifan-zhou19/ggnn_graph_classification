package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double m;
		double n;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= j;i++)
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
			h = b * b - 4 * a * c;
			if (h > 0)
			{
			d = (-b + Math.sqrt(h)) / (2 * a);
			e = (-b - Math.sqrt(h)) / (2 * a);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",d,e);
			}
			if (h == 0)
			{
			f = (-b) / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",f);
			}
			if (h < 0)
			{
			m = (-b) / (2 * a);
			n = Math.sqrt(-h) / (2 * a);
			System.out.printf("x1=%.5lf+%.5lfi;",m,n);
			System.out.printf("x2=%.5lf-%.5lfi\n",m,n);
			}
		}
			return 0;
	}
}

