package <missing>;

public class GlobalMembers
{
	public static int count(int x,int y)
	{
		if (y == 1 || x == 0)
		{
			return 1;
		}
		if (x < y)
		{
			return count(x, x);
		}
		return count(x, y - 1) + count(x - y, y);
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(count(m, n));
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

