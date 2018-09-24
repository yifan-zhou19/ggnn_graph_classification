package <missing>;

public class GlobalMembers
{
	public static double fangcheng(double a,double b,double c)
	{
		double d;
		double x1;
		double x2;
		double m;
		double n;
		d = b * b - 4 * a * c;
		if (d > 0)
		{
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
		}
		else if (d == 0)
		{
			x1 = -b / (2 * a);
			x2 = -b / (2 * a);
			System.out.printf("x1=x2=%.5lf\n",x1);
		}
		else if (d < 0)
		{
			m = -b / (2 * a);
			n = Math.sqrt(-d) / (2 * a);
			if (m == -0)
			{
				m = 0;
			}
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",m,n,m,n);
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
		 double a;
		 double b;
		 double c;
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
		  n = n - 1;
		  fangcheng(a, b, c);
		}
		return 0;
	}
}

