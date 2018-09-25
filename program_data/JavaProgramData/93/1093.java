package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int n;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 3 == 0)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		if (x % 5 == 0)
		{
			b = 2;
		}
		else
		{
			b = 0;
		}
		if (x % 7 == 0)
		{
			c = 4;
		}
		else
		{
			c = 0;
		}

		n = a + b + c;

		if (n == 7)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (n == 6)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		else if (n == 5)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		else if (n == 4)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else if (n == 3)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (n == 2)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (n == 1)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (n == 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}
}

