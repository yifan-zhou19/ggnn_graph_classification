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
		double k;
		double l;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			g = Integer.parseInt(tempVar);
		}
		for (h = 0;h < g;h++)
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
		if (b == 0)
		{
		b = -b;
		}
		if (d > 0)
		{
			e = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			f = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			if (e < f)
			{
				l = e;
				e = f;
				f = l;
			}
			System.out.printf("x1=%.5lf;x2=%.5lf\n",e,f);
		}
		else if (d == 0)
		{
			e = -b / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",e);
		}
		else
		{
			e = (-b) / (2 * a);
			f = (-b) / (2 * a);
			k = Math.sqrt(-d) / (2 * a);
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,k,f,k);
		}
		}
		return 0;
	}

}

