package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		a = 3, b = 5, c = 7;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 105 == 0)
		{
			System.out.print(a);
			System.out.print(' ');
			System.out.print(b);
			System.out.print(' ');
			System.out.print(c);
			System.out.print("\n");
		}
		else
		{
			if (x % 15 == 0 || x % 35 == 0 || x % 21 == 0)
			{
					if (x % 15 == 0)
					{
					System.out.print(a);
					System.out.print(' ');
					System.out.print(b);
					System.out.print("\n");
					}
					if (x % 35 == 0)
					{
					System.out.print(b);
					System.out.print(' ');
					System.out.print(c);
					System.out.print("\n");
					}
					if (x % 21 == 0)
					{
					System.out.print(a);
					System.out.print(' ');
					System.out.print(c);
					System.out.print("\n");
					}
			}
			else
			{
				if (x % 3 == 0)
				{
				System.out.print(a);
				System.out.print("\n");
				}
				if (x % 5 == 0)
				{
				System.out.print(b);
				System.out.print("\n");
				}
				if (x % 7 == 0)
				{
				System.out.print(c);
				System.out.print("\n");
				}
				if (x % 3 != 0 && x % 7 != 0 && x % 5 != 0)
				{
				System.out.print("n");
				System.out.print("\n");
				}
			}

		}
		return 0;
	}
}

