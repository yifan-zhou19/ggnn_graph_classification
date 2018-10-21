package <missing>;

public class GlobalMembers
{
	public static int kuai(int x, int y)
	{
		if (x == y)
		{
		System.out.print(x);
		System.out.print("\n");
		}
		if (x < y)
		{
		kuai(x, y / 2);
		}
		if (x > y)
		{
		kuai(x / 2, y);
		}
		return x;
	}
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		kuai(a, b);
		return 0;
	}

}

