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
		if (n < 10)
		{
			System.out.print(n);
		}
		else if (n < 100)
		{
				a = n % 10;
			b = n / 10;
			System.out.print(a);
			System.out.print(b);
		}
		else if (n < 1000)
		{
			a = n % 10;
		b = n / 10;
		c = b % 10;
		d = b / 10;
		System.out.print(a);
		System.out.print(c);
		System.out.print(d);
		}
		else if (n < 10000)
		{
			a = n % 10;
		b = n / 10;
		c = b % 10;
		d = b / 10;
		e = d % 10;
		f = d / 10;
		System.out.print(a);
		System.out.print(c);
		System.out.print(e);
		System.out.print(f);
		}
		else if (n == 10000)
		{
			System.out.print(00001);
		}
		return 0;
	}
}

