package <missing>;

public class GlobalMembers
{
	public static int set(int m, int n, int max) // ???m?????n?????????max??????
	{
		int count = 0;
		if (m == 0)
		{
			return 1;
		}
		if (n == 0 || m > n * max)
		{
			return 0;
		}
		if (m < max)
		{
			max = m;
		}
		for (int i = 1; i <= max; i++)
		{
			count += set(m - i, n - 1, i);
		}
		return count;
	}
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(set(m, n, 100));
			System.out.print("\n");
		}
		return 0;
	}
}

