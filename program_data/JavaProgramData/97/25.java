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
		int x;
		a = b = c = d = e = f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 100;
		x = n % 100;
		b = x / 50;
		x %= 50;
		c = x / 20;
		x %= 20;
		d = x / 10;
		x %= 10;
		e = x / 5;
		f = x % 5;
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
		return 0;
	}

}

