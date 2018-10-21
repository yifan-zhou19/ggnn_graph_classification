package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print((int)(n / 100));
		System.out.print("\n");
		if (n >= 100)
		{
			n = n - 100 * ((int)(n / 100));
		}

		System.out.print((int)(n / 50));
		System.out.print("\n");
		if (n >= 50)
		{
			n = n - 50;
		}

		System.out.print((int)(n / 20));
		System.out.print("\n");
		if (n >= 20)
		{
			n = n - ((int)(n / 20)) * 20;
		}

		System.out.print((int)(n / 10));
		System.out.print("\n");
		if (n >= 10)
		{
			n -= 10;
		}

		System.out.print((int)(n / 5));
		System.out.print("\n");
		if (n >= 5)
		{
			n -= 5;
		}

		System.out.print(n);
		System.out.print("\n");


		return 0;
	}
}

