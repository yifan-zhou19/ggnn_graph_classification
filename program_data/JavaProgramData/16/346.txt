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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n <= 9 && 0 <= n)
		{
			System.out.print(n);
		}
		if (n <= 99 && 10 <= n)
		{
			a = n % 10;
			n = n / 10;
			System.out.print(a);
			b = n % 10;
				System.out.print(b);
		}
		if (n <= 999 && 100 <= n)
		{
			a = n % 10;
			n = n / 10;
			System.out.print(a);
			b = n % 10;
			n = n / 10;
			System.out.print(b);
			c = n % 10;
			System.out.print(c);
		}
		if (n <= 9999 && 1000 <= n)
		{
			a = n % 10;
			n = n / 10;
			System.out.print(a);
			b = n % 10;
			n = n / 10;
			System.out.print(b);
			c = n % 10;
			n = n / 10;
			System.out.print(c);
			d = n % 10;
			System.out.print(d);
		}
		if (n == 10000)
		{
			System.out.print("00001");
		}
		return 0;
	}
}

