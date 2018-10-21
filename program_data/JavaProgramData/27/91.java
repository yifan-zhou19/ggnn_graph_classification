package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		double p;
		double q;
		double t;
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
			p = -b / (2 * a);
			t = b * b - 4 * a * c;

			if (t > 0)
			{
				q = Math.sqrt(b * b - 4 * a * c) / (2 * a);
				x1 = p + q;
				x2 = p - q;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (t == 0)
			{
			System.out.printf("x1=x2=%.5lf\n",p);
			}
			else if (t < 0)
			{
				q = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",p,q,p,q);
			}
		}
	}










}

