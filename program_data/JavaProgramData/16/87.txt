package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((n >= 1) && (n <= 9))
		{
			System.out.print(n);
			System.out.print("\n");
		}
		if ((n >= 10) && (n < 100))
		{
			int a = n / 10;
			int b = n % 10;
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		if ((n >= 100) && (n <= 999))
		{
			int a = n / 100;
			int b = (n % 100) / 10;
			int c = (n % 100) % 10;
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		if ((n >= 1000) && (n < 9999))
		{
			int a = n / 1000;
			int b = (n % 1000) / 100;
			int c = ((n % 1000) % 100) / 10;
			int d = ((n % 1000) % 100) % 10;
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
		}
		return 0;
	}
}

