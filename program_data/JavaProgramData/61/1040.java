package <missing>;

public class GlobalMembers
{
	public static int fib(int i)
	{
		int a = 0;
		int b = 1;
		while (--i != 0)
		{
			a = a + b;
			swap(a, b);
		}
		return b;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int i;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fib(i));
			System.out.print("\n");
		}
		return 0;
	}
}

