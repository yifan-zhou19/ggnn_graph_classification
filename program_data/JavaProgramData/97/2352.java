package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = n / 100;
	System.out.print(a);
	System.out.print("\n");
	if (a != 0)
	{
		n = n - 100 * a;
	}
	else
	{
		n = n;
	}
	b = n / 50;
	System.out.print(b);
	System.out.print("\n");
	if (b != 0)
	{
	n = n - 50 * b;
	}
	else
	{
		n = n;
	}
	c = n / 20;
	System.out.print(c);
	System.out.print("\n");
	if (c != 0)
	{
		n = n - 20 * c;
	}
	else
	{
		n = n;
	}
	d = n / 10;
	System.out.print(d);
	System.out.print("\n");
	if (d != 0)
	{
		n = n - d * 10;
	}
	else
	{
		n = n;
	}
	e = n / 5;
	System.out.print(e);
	System.out.print("\n");
	if (e != 0)
	{
		n = n - 5 * e;
	}
	else
	{
		n = n;
	}
	f = n;
	System.out.print(f);
	System.out.print("\n");
		return 0;
	}
}

