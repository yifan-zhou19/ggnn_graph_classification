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
		a = n % 10;
		n = (n - a) / 10;
		b = n % 10;
		n = (n - b) / 10;
		c = n % 10;
		n = (n - c) / 10;
		d = n % 10;
		n = (n - d) / 10;
		e = n % 10;
		n = (n - e) / 10;
		if (e != 0)
		{
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
			System.out.print(d);
			System.out.print(e);
			System.out.print("\n");
		}
		else
		{
			if (d != 0)
			{
				System.out.print(a);
				System.out.print(b);
				System.out.print(c);
				System.out.print(d);
				System.out.print("\n");
			}
			else
			{
				if (c != 0)
				{
					System.out.print(a);
					System.out.print(b);
					System.out.print(c);
					System.out.print("\n");
				}
				else
				{
					if (b != 0)
					{
						System.out.print(a);
						System.out.print(b);
						System.out.print("\n");
					}
					else
					{
						System.out.print(a);
						System.out.print("\n");
					}
				}
			}
		}
		return (0);
	}
}

