package <missing>;

public class GlobalMembers
{
	public static void f(int n)
	{
	if (n == 1)
	{
		System.out.print("End");
	return;
	}
	if (n % 2 == 0)
	{
		System.out.print(n);
		System.out.print('/');
		System.out.print(2);
		System.out.print('=');
		System.out.print(n / 2);
		System.out.print("\n");
	f(n / 2);
	}
	if (n % 2 == 1)
	{
		System.out.print(n);
		System.out.print('*');
		System.out.print(3);
		System.out.print('+');
		System.out.print(1);
		System.out.print('=');
		System.out.print(3 * n + 1);
		System.out.print("\n");
	f(3 * n + 1);
	}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
	}
}

