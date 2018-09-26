package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double disc;
		double p;
		double q;
		double[][] w = new double[99][3];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
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
			w[x][0] = a;
			w[x][1] = b;
			w[x][2] = c;
		}
		for (x = 0;x < n;x++)
		{
			a = w[x][0];
			b = w[x][1];
			c = w[x][2];
			disc = b * b - 4 * a * c;
			if (Math.abs(disc) < 1e-6)
			{
				System.out.printf("x1=x2=%.5f\n",-b / 2 / a);
			}
			else
			{
				if (disc > 1e-6)
				{
					x1 = (-b + Math.sqrt(disc)) / 2 / a;
					x2 = (-b - Math.sqrt(disc)) / 2 / a;
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
			}
				if (disc < -(1e-6))
				{
					p = -b / 2 / a;
					q = Math.sqrt(-disc) / 2 / a;
					if (Math.abs(b) < 1e-6)
					{
						p = Math.abs(p);
					}
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
				}
		}
	}
}

