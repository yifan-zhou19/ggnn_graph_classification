package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	double a;
	double b;
	double c;
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	double d = b * b - 4 * a * c;
	if (Math.abs(d) < 1e-8)
	{
		d = 0;
	}
	double e = -b / 2 / a;
	if (Math.abs(e) < 1e-8)
	{
		e = 0;
	}
	if (Math.abs(d) < 1e-8)
	{
		System.out.printf("x1=x2=%.5f",e);
	}
	else if (d > 0)
	{
		System.out.printf("x1=%.5f;x2=%.5f",e + Math.sqrt(d) / 2 / a,e - Math.sqrt(d) / 2 / a);
	}
	else
	{
	d = Math.abs(d);
	if (a > 0)
	{
	System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi",e,Math.sqrt(d) / 2 / a,e,Math.sqrt(d) / 2 / a);
	}
	else
	{
		System.out.printf("x1=%.5f-%.5fi;x2=%.5f+%.5fi",e,-Math.sqrt(d) / 2 / a,e,-Math.sqrt(d) / 2 / a);
	}
	}
	System.out.print("\n");
	}
	return 0;
	}
}

