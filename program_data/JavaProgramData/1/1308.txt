package <missing>;

public class GlobalMembers
{
	public static int calculate(int a, int num)
	{ // a is the max num
		int sum = 0;
		if (num == 1)
		{
			return 1;
		}
		for (int i = num; i >= 2; i--)
		{
			if (num % i == 0 && i <= a)
			{
				sum += calculate(i, num / i);
			}
		}
		return sum;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		for (int i = 0; i < n; i++)
		{ // input part
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(calculate(num, num));
			System.out.print("\n");
		}
		return 0;
	}
}

