package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double p;
		double q;
	int n;
	int j;
	char y = 'i';
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
	if (b * b - 4 * a * c < 0)
	{
		p = b / (-2 * a);
		q = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
	 if (p == -0)
	 {
		 p = 0;
	 }
	System.out.printf("x1=%.5lf+%.5lf%c;x2=%.5lf-%.5lf%c\n",p,q,y,p,q,y);
	}
	if (b * b - 4 * a * c == 0)
	{
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.printf("x1=x2=%.5lf\n",x1);
	}
	if (b * b - 4 * a * c > 0)
	{
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
	}
	}
	return 0;
	}

}

