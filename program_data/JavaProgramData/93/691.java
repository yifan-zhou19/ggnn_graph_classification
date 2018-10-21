package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = a % 3;
		c = a % 5;
		d = a % 7;
		if (b == 0 && c == 0 && d == 0)
		{
			System.out.print(3);
			System.out.print(' ');
			System.out.print(5);
			System.out.print(' ');
			System.out.print(7);
			System.out.print("\n");
		}
		else if (b == 0 && c == 0 && d != 0)
		{
			System.out.print(3);
			System.out.print(' ');
			System.out.print(5);
			System.out.print("\n");
		}
		else if (b == 0 && d == 0 && c != 0)
		{
			System.out.print(3);
			System.out.print(' ');
			System.out.print(7);
			System.out.print("\n");
		}
		else if (c == 0 && d == 0 && b != 0)
		{
			System.out.print(5);
			System.out.print(' ');
			System.out.print(7);
			System.out.print("\n");
		}
		else if (b == 0 && c != 0 && d != 0)
		{
			System.out.print(3);
			System.out.print("\n");
		}
		else if (c == 0 && b != 0 && d != 0)
		{
			System.out.print(5);
			System.out.print("\n");
		}
		else if (d == 0 && b != 0 && c != 0)
		{
			System.out.print(7);
			System.out.print("\n");
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}

}

