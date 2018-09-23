package <missing>;

public class GlobalMembers
{
	public static int up(int m)
	{
		return (m % 2 == 0)?m / 2:(m - 1) / 2;
	}
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int powerm;
		int powern;
		if (m < n)
		{
			int temp = m;
			m = n;
			n = temp;
		}
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		for (powerm = 0;(m >> powerm) > 0;powerm++)
		{
			;
		}
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		for (powern = 0;(n >> powern) > 0;powern++)
		{
			;
		}
		while (powerm > powern)
		{
			m = up(m);
			powerm--;
		}
		while (m != n)
		{
			m = up(m);
			n = up(n);
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

