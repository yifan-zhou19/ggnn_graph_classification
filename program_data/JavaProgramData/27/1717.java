package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double d;
		double m;
		double k;
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
			if (d == 0)
			{
				m = -b / 2 / a;
				System.out.printf("x1=x2=%.5lf\n",m);
			}
			else if (d > 0)
			{
				m = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				k = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",m,k);
			}
			else
			{
				m = -b / 2 / a;
				k = Math.sqrt(-d) / 2 / a;
				if (m == 0)
				{
					m = 0;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,k,m,k);
			}
		}
		return 0;
	}
}

