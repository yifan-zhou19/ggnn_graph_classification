package <missing>;

public class GlobalMembers
{
	public static int fib(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return (fib(n - 1) + fib(n - 2));
		}
	}
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fib(n));
			System.out.print("\n");
		}
		return 0;
	}
}

