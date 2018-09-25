package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a = (int)(m / 100);
		m = m - 100 * a;
		b = (int)(m / 50);
		m = m - 50 * b;
		c = (int)(m / 20);
		m = m - 20 * c;
		d = (int)(m / 10);
		m = m - 10 * d;
		e = (int)(m / 5);
		m = m - 5 * e;
		f = m;
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
	System.out.print(c);
	System.out.print("\n");
	System.out.print(d);
	System.out.print("\n");
	System.out.print(e);
	System.out.print("\n");
	System.out.print(f);
	System.out.print("\n");
	return 0;
	}
}

