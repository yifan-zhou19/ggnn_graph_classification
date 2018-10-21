package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		double a;
		double b;
		double c;
		int n;
		double x1;
		double x2;
		double m;
		double p;
		double q;
		int i = 0;
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

			m = b * b - 4 * a * c;
			if (m == 0)
			{
				x1 = (-b) / (2 * a);
				x2 = (-b) / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (m > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (m < 0)
			{
				p = (-b) / (2 * a);
				q = (Math.sqrt(-b * b + 4 * a * c) / (2 * a));
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
			}
		}

	}

}

