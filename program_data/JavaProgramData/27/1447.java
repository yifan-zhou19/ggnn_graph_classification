package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double disc;
		double p;
		double q;
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
			disc = b * b - 4 * a * c;
			if (disc > 0)
			{
				q = Math.sqrt(disc);
				x1 = ((-1) * b + q) / (2 * a);
				x2 = ((-1) * b - q) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n", x1, x2);
			}
			else if (disc == 0)
			{
				p = (-1) * b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",p);
			}
			else if (disc < 0)
			{
				q = Math.sqrt((-1) * disc) / (2 * a);
				p = (-1) * b / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n", p, q, p, q);
			}
		}
	}
}

