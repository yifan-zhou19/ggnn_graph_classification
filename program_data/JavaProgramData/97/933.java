package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int s;
	int d;
	int f;
	int g;
	int h;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = n / 100;
	s = (n - 100 * a) / 50;
	d = (n - 100 * a - 50 * s) / 20;
	f = (n - 100 * a - 50 * s - 20 * d) / 10;
	g = n % 10 / 5;
	h = n % 5;
	System.out.print(a);
	System.out.print("\n");
	System.out.print(s);
	System.out.print("\n");
	System.out.print(d);
	System.out.print("\n");
	System.out.print(f);
	System.out.print("\n");
	System.out.print(g);
	System.out.print("\n");
	System.out.print(h);
	System.out.print("\n");

	return 0;
	}
}

