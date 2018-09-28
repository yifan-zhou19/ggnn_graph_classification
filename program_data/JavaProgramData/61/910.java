package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[MAX];
	public static int f(int x)
	{
		if (x == 1 || x == 2)
		{
			return 1;
		}
		return f(x - 1) + f(x - 2);
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int a = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a));
			System.out.print("\n");
		}
		return 0;
	}
}

