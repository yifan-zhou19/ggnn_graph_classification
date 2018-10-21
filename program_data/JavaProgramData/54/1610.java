package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int apples;

	public static int func(int monkeys)
	{
		if (monkeys == n)
		{
			return apples++;
		}

		int tmp = func(monkeys + 1);
		while (tmp % (n - 1) != 0)
		{
			tmp = func(monkeys + 1);
		}
		return k + tmp * n / (n - 1);
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apples = n - 1;
		System.out.print(func(0));
		System.out.print("\n");
	}
}

