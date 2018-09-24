package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int if_k_is = int;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int k = 1;k <= n;k++)
		{
			if (if_k_is(k) != 0)
			{
				sum += k * k;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

	public static int if_k_is(int k)
	{
		if (k % 7 == 0)
		{
			return 0;
		}
		while (k != 0)
		{
			if (k % 10 == 7)
			{
				return 0;
			}
			k = k / 10;
		}
		return 1;
	}
}

