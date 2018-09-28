package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		double x1;
		double x2;
		double m;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a;
		double b;
		double c;
		for (j = 1;j <= n;j++)
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
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
				else if (b * b - 4 * a * c == 0)
				{
				x1 = x2 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
				}
				else
				{
				x1 = -b / (2 * a);
				m = (Math.sqrt(4 * a * c - b * b) / (2 * a));
				x2 = -b / (2 * a);
				p = (Math.sqrt(4 * a * c - b * b) / (2 * a));
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,m,x2,p);
				}
		}
		return 0;
	}


}

