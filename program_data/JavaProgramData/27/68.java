package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	double a;
	double b;
	double c;
	double d;
	double e;
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
	if ((b * b - 4 * a * c) < 0)
	{
		d = (-(b / (2 * a)));
	 e = (Math.sqrt(-b * b + 4 * a * c)) / (2 * a);
	 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", d, e, d, e);
	}
	else if ((b * b - 4 * a * c) >= 0)
	{
		d = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	 e = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	if (d == e)
	{
	 System.out.printf("x1=x2=%.5f\n", d);
	}
	 else if (!(d == e))
	 {
		 System.out.printf("x1=%.5f;x2=%.5f\n", d, e);
	 }
	}
	}
	}
}

