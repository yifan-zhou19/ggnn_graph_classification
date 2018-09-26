package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		int c;
		int d;
		int e;
		a = n / 100;
		n = n % 100;
		b = n / 50;
		n = n % 50;
		c = n / 20;
		n = n % 20;
		d = n / 10;
		n = n % 10;
		e = n / 5;
		n = n % 5;
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
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}

