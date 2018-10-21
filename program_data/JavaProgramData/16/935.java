package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		float n;
		n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		a = Math.floor(n / 1000);
		b = Math.floor((n - a * 1000) / 100);
		c = Math.floor((n - a * 1000 - b * 100) / 10);
		d = n - a * 1000 - b * 100 - c * 10;
		if (n / 1000 >= 1)
		{
		System.out.print(d);
		System.out.print(c);
		System.out.print(b);
		System.out.print(a);
		System.out.print("\n");
		}
		if (n / 1000 < 1 && n / 100 >= 1)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
		}
		if (n / 100 < 1 && n / 10 >= 1)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		if (n / 10 < 1)
		{
			System.out.print(d);
			System.out.print("\n");
		}
		return 0;
	}

}

