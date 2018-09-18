package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 10;
		int b = 10;
		int c = 10;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 10000)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
		do
		{
			a--;
		} while ((n - a * 1000 < 0) || (n - a * 1000 >= 1000));
		}
			n = n - a * 1000;
		do
		{
			b--;
		} while ((n - b * 100 < 0) || (n - b * 100 >= 100));
			n = n - b * 100;
		do
		{
			c--;
		} while ((n - c * 10 < 0) || (n - c * 10 >= 10));
			n = n - c * 10;
		d = n;
		if ((a == 0) && (b == 0) && (c == 0))
		{
			System.out.print(d);
			System.out.print("\n");
		}
		else if ((a == 0) && (b == 0))
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		else if (a == 0)
		{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
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

