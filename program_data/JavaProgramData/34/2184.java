package <missing>;

public class GlobalMembers
{
	public static void f1(int a)
	{
		int b;
		b = a * 3 + 1;
		System.out.print(a);
		System.out.print("*");
		System.out.print(3);
		System.out.print("+");
		System.out.print(1);
		System.out.print("=");
		System.out.print(b);
		System.out.print("\n");
	}
	public static void f2(int a)
	{
		int b;
		b = a / 2;
		System.out.print(a);
		System.out.print("/");
		System.out.print(2);
		System.out.print("=");
		System.out.print(b);
		System.out.print("\n");
	}
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != 1)
		{
			if (x % 2 == 0)
			{
				f2(x);
				x = x / 2;
			}
			if (x % 2 == 1 && x != 1)
			{
				f1(x);
				x = x * 3 + 1;
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

