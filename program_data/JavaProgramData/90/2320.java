package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y);
		int t;
		int[] m = new int[20];
		int[] n = new int[20];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < t;i++)
		{
		m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < t;i++)
		{
			System.out.print(f(m[i], n[i]));
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int x,int y)
	{
		if (x == 0 || y == 1)
		{
		return 1;
		}
		if (x < y)
		{
		return f(x, x);
		}
		return f(x, y - 1) + f(x - y, y);
	}

}

