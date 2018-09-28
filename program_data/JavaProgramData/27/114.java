package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float a;
		float b;
		float c;
		double x1;
		double x2;
		double t;
		double p;
		double q;
		int i;
		int n;
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
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			t = b * b - 4 * a * c;
			p = -b / (2 * a);
			if (t < 0)
			{
				q = Math.sqrt(-t) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;",p,q);
				System.out.printf("x2=%.5lf-%.5lfi\n",p,q);
			}
			else
			{
				q = Math.sqrt(t) / (2 * a);
				x1 = p + q;
				x2 = p - q;
				if (x1 == x2)
				{
					System.out.printf("x1=x2=%.5lf\n",x1);
				}
				else
				{
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}
			};
		};
	}

}

