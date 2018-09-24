package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		double p;
		double q;
		double re;
		double im;
		double x1;
		double x2;
		double a;
		double b;
		double c;
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
			p = 2 * a;
			q = Math.sqrt(b * b - 4 * a * c);
			if (Math.abs(q) <= 1e-6)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else if (q > 1e-6)
			{
				x1 = (-b + q) / p;
				x2 = (-b - q) / p;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else
			{
				re = -b / p;
				im = Math.sqrt(-b * b + 4 * a * c) / p;
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",re,im,re,im);
			}
		}
	}
}

