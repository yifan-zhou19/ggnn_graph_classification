package <missing>;

public class GlobalMembers
{
	public static double dt(double a,double b,double c)
	{
		return (b * b - 4 * a * c);
	}
	public static double ba(double a,double b)
	{
		return (-b / (2 * a));
	}
	public static double gdt(double a,double dtt)
	{
		return (Math.sqrt(dtt) / (2 * a));
	}
	public static double yu(double a,double b,double c)
	{
		return (Math.sqrt(Math.abs(-dt(a, b, c) / (4 * a))));
	}
	public static void Main()
	{
		int n;
		double a;
		double b;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		double d;
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
			if (ba(a, b) < 1e-25 && ba(a, b)>-1e-25)
			{
				d = 0.0;
			}
			else
			{
				d = ba(a, b);
			}
			if (dt(a, b, c) == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",d);
			}
			else if (dt(a, b, c) > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",d + gdt(a, dt(a, b, c)),d - gdt(a, dt(a, b, c)));
			}
			else if (dt(a, b, c) < 0)
			{
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",d,yu(a, b, c) / Math.sqrt(a),d,yu(a, b, c) / Math.sqrt(a));
			}
		}
	}
}

