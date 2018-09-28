package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double x1;
		double x2;
		double a;
		double b;
		double c;
		double s;
		double q;
		double w;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
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
		s = b * b - 4 * a * c;
		if (s > 0)
		{
			x1 = (-b + Math.sqrt(s)) / (2 * a);
		x2 = (-b - Math.sqrt(s)) / (2 * a);
		System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		}
		else if (s == 0)
		{
			{
				if (b == 0)
				{
			x1 = x2 = 0;
				}
		else
		{
			x1 = x2 = -b / (2 * a);
		}
		}

		System.out.printf("x1=x2=%.5lf\n",x1);
		}
		else
		{
			q = -b / (2 * a);
		w = Math.sqrt(-s) / (2 * a);
		{
			if (b == 0)
			{
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",q,w,q,w);
			}
		else
		{



			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",q,w,q,w);
		}
		}
		}
		}


	}


}

