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
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n >= 100)
		{
			n -= 100;
			a++;
		}
		while (n >= 50)
		{
			n -= 50;
			b++;
		}
		while (n >= 20)
		{
			n -= 20;
			c++;
		}
		while (n >= 10)
		{
			n -= 10;
			d++;
		}
		while (n >= 5)
		{
			n -= 5;
			e++;
		}
		while (n >= 1)
		{
			n -= 1;
			f++;
		}
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

