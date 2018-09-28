package <missing>;

public class GlobalMembers
{
	public static int n;

	public static void oddnum(int a)
	{
		int b;
			b = a * 3 + 1;
			n = b;
		System.out.print(a);
		System.out.print('*');
		System.out.print(3);
		System.out.print('+');
		System.out.print(1);
		System.out.print('=');
		System.out.print(b);
		System.out.print("\n");
	}

	public static void evennum(int a)
	{
		int b;
		b = a / 2;
		n = b;
		System.out.print(a);
		System.out.print('/');
		System.out.print(2);
		System.out.print('=');
		System.out.print(b);
		System.out.print("\n");
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			while (n != 1)
			{
				if (n % 2 == 0)
				{
					evennum(n);
				}
				else
				{
					oddnum(n);
				}
			}
			System.out.print("End");
		}
		return 0;
	}
}

