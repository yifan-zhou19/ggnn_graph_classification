package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int d = 1;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double y;
		double p;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (d = 1;d <= n;d++)
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
			y = b * b - 4 * a * c;
			if (y > 0)
			{
				x1 = (-b + Math.sqrt(y)) / (2 * a);
				x2 = (-b - Math.sqrt(y)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (y == 0)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				p = -b / (2 * a);
				q = Math.sqrt(-y) / (2 * a);
				if (b == 0)
				{
					p = -p;
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
				}
				if (b != 0)
				{
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
				}
			}
		}
		return 0;
	}




}

