package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int limit;
		int count = 0;

		limit = Math.sqrt(n);

		for (int i = 2; i <= limit; i++)
		{
			if (n % i == 0)
			{
			count = 1;
			}
		}

		if (count == 0)
		{
		return 1;
		}

		return 0;
	}

	public static int Main()
	{
		int m;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 3; i <= m / 2; i += 2)
		{
			if (judge(i) == 1 && judge(m - i) == 1)
			{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(m - i);
			System.out.print("\n");
			}
		}

		return 0;

	}
}

