package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double s;
	double t;
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
	if (b * b - 4 * a * c == 0)
	{
	x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.printf("x1=x2=%.5f\n",x1);
	}
	if (b * b - 4 * a * c > 0)
	{
	x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	}
	if (b * b - 4 * a * c < 0)
	{
	s = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
	t = ((-1.0) * b) / (2 * a);
	if (t != 0)
	{
	System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",t,s,t,s);
	}
	if (t == 0)
	{
	System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",s,s);
	}
	}
	}
	}
}

