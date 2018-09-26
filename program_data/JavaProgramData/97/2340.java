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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 100;
		n = n - (n / 100) * 100;
		System.out.print(a);
		System.out.print("\n");
		b = n / 50;
		n = n - (n / 50) * 50;
		System.out.print(b);
		System.out.print("\n");
		c = n / 20;
		n = n - (n / 20) * 20;
		System.out.print(c);
		System.out.print("\n");
		d = n / 10;
		n = n - (n / 10) * 10;
		System.out.print(d);
		System.out.print("\n");
		e = n / 5;
		System.out.print(e);
		System.out.print("\n");
		n = n - (n / 5) * 5;
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}

