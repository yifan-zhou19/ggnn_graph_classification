package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int amount;

	public static int Amount(int amount, int step)
	{
		if (amount % (n - 1) == 0)
		{
			amount = n * amount / (n - 1) + k;
			step++;
		}
		else
		{
			return 0;
		}
		if (step < n)
		{
			return Amount(amount, step);
		}
		if (step == n)
		{
			return amount;
		}
	}

	public static int Main()
	{
		int x;
		int step = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; ; i++)
		{
			amount = n * i + k;
			x = Amount(amount, step);
			if (x == 0)
			{
				continue;
			}
			else
			{
				System.out.print(x);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}


}

