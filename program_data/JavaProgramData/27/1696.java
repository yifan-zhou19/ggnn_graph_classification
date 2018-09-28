package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double m;
		double e;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while ((i <= n) && a != 0)
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
			m = b * b - 4 * a * c;
			e = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   f = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   if (b != 0)
			   {
			if ((e != f) && (m >= 0))
			{
			   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if ((m >= 0) && (e = f) != 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				x1 = -b / (2 * a);
				x2 = Math.sqrt(-m) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
			}
			   }
			   else
			   {
				   if ((e != f) && (m >= 0))
				   {
			   x1 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   x2 = (-Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				   }
			else if ((m >= 0) && (e = f) != 0)
			{
				x1 = (Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				x1 = -b / (2 * a);
				x2 = Math.sqrt(-m) / (2 * a);
				System.out.printf("x1=-0.00000+%.5lfi;x2=-0.00000-%.5lfi\n",x2,x2);
			}
			   }
			   i++;
		}
	return 0;
	}



}

