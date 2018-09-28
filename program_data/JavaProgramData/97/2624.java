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
		if (a != 0)
		{
			System.out.print(a);
			System.out.print("\n");
			n = n % 100;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}


		b = n / 50;
		if (b != 0)
		{
			System.out.print(b);
			System.out.print("\n");
			n = n % 50;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}


		c = n / 20;
		if (c != 0)
		{
			System.out.print(c);
			System.out.print("\n");
			n = n % 20;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}


		d = n / 10;
		if (d != 0)
		{
			System.out.print(d);
			System.out.print("\n");
			n = n % 10;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}


		e = n / 5;
		if (e != 0)
		{
			System.out.print(e);
			System.out.print("\n");
			n = n % 5;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}

		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}

