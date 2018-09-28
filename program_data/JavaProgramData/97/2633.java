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
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		int f1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n / 100;
		a1 = n % 100;
		b = a1 / 50;
		b1 = (n - a * 100) % 50;
		c = b1 / 20;
		c1 = (n - b * 50) % 20;
		d = c1 / 10;
		d1 = (n - c * 20) % 10;
		e = d1 / 5;
		e1 = (n - d * 10) % 5;
		f = e1;
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
		System.in.read();
		return 0;
	}
}

