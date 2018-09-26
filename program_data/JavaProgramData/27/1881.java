package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double delta;
		double m;
		double n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i-- != 0)
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
			delta = b * b - 4 * a * c;

			if (delta < 0)
			{
				m = -b / 2 / a;
				n = Math.sqrt(-delta) / 2 / a;
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,n,m,n);
			}
			else
			{
				if (delta == 0)
				{
					m = -b / 2 / a;
					System.out.printf("x1=x2=%.5lf\n",m);
				}
				else
				{
					m = -b / 2 / a;
					n = Math.sqrt(delta) / 2 / a;
					System.out.printf("x1=%.5lf;x2=%.5lf\n",m + n,m - n);
				}
			}
		}
		return 0;
	}



}

