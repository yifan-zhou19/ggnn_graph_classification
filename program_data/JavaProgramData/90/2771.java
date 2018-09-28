package <missing>;

public class GlobalMembers
{
	public static int ans(int x, int y)
	{
		if (y == 1)
		{
			return 1;
		}
		if (x == y)
		{
			return (ans(x, y - 1) + 1);
		}
		if (x < y)
		{
			return ans(x, x);
		}
		if (x > y)
		{
			return ans(x, y - 1) + ans(x - y, y);
		}
	}
	public static int Main()
	{
		int t;
		int[] m = new int[100];
		int[] n = new int[100];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < t; i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(ans(m[i], n[i]));
			System.out.print("\n");
		}
		return 0;
	}
}

