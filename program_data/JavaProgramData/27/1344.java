package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		double a;
		double b;
		double c;
		double m;
		double n;
		double x1;
		double x2;
		double d;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				j = Integer.parseInt(tempVar);
			}
		for (i = 0;i < j;i++)
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

			if (d == 0)
			{
				m = -b / (2 * a);
				n = Math.sqrt(d);
				x1 = x2 = m;
				System.out.printf("x1=x2=%.5lf\n",m);
			}
			else if (d > 0)
			{
				m = -b / (2 * a);
				n = Math.sqrt(d) / (2 * a);
				x1 = m + n;
				x2 = m - n;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else
			{
				 m = -b / (2 * a);
				n = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;",m,n);
				System.out.printf("x2=%.5lf-%.5lfi\n",m,n);
			}

		}
	}


}

