package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double d;
		double e;
		double m;
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
			if (d > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("\nx1=%.5lf;x2=%.5lf",x1,x2);
			}
			else if (d == 0)
			{
				x1 = 0 - b / (2 * a);
				x2 = x1;
				System.out.printf("\nx1=x2=%.5lf",x1);
			}
			else
			{

				e = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				m = 0 - b / (a * 2);
				System.out.printf("\nx1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi",m,e,m,e);
			}
		}
	}


}

