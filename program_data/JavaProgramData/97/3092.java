package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		r = n;
		a = (r - r % 100) / 100;
		r = r % 100;
		b = (r - r % 50) / 50;
		r = r % 50;
		c = (r - r % 20) / 20;
		r = r % 20;
		d = (r - r % 10) / 10;
		r = r % 10;
		e = (r - r % 5) / 5;
		r = r % 5;
		f = r;
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

