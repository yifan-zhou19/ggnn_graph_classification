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
		a = n / 10000;
		b = (n - 10000 * a) / 1000;
		c = (n - 10000 * a - 1000 * b) / 100;
		d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
		e = n - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a != 0)
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		else if (b != 0)
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
		}
		else if (c != 0)
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		else if (d != 0)
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print("\n");
		}
		else
		{
			System.out.print(e);
			System.out.print("\n");
		}
		return 0;
	}
}

