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
		double e;
		double s;
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
			d = b * b - 4 * a * c;

			e = (-1) * b / (2 * a);
			if (d > 0)
			{
				s = Math.sqrt(d) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",e + s,e - s);
			}
			else if (d < 0)
			{
				s = Math.sqrt((-1) * d) / (2 * a);
				if (e == 0)
				{
					e = 0 - e;
				}
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",e,s,e,s);
			}
				else
				{
				System.out.printf("x1=x2=%.5lf\n",e);
				}
		}
		return 0;
	}
}

