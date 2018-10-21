package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int func = new int(int a,int b);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int number;
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(func(number, number));
			System.out.print("\n");
		}
		return 0;
	}

	public static int func(int a,int b)
	{
		if (a == 1)
		{
			return 1;
		}
		if (b == 1)
		{
			return 0;
		}
		if (a % b == 0)
		{
			return func(a / b, b) + func(a, b - 1);
		}
		return func(a, b - 1);
	}
}

