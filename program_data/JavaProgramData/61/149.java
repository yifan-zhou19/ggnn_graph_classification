package <missing>;

public class GlobalMembers
{
	public static int[] mem = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int fib(int a)
	{
		if (a <= 2)
		{
			return 1;
		}
		if (mem[a] != 0)
		{
			return mem[a];
		}
		int result;
		result = fib(a - 1) + fib(a - 2);
		mem[a] = result;
		return result;
	}
	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fib(a));
			System.out.print("\n");
		}
		return 0;
	}

}

