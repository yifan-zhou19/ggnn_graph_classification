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
		a = n / 1000;
		b = (n - 1000 * a) / 100;
		c = (n - 1000 * a - b * 100) / 10;
		d = n - 1000 * a - b * 100 - c * 10;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print(d);
					System.out.print("\n");
				}
				else
				{
					System.out.print(d);
					System.out.print(c);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(d);
				System.out.print(c);
				System.out.print(b);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}
}

