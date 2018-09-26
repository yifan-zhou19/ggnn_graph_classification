package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if (x == 1 || x == 2)
		{
			return 1;
		}
		else
		{
			return f(x - 1) + f(x - 2);
		}
	}
	public static int Main()
	{
		int num;
		int[] n = new int[10];
		int r;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 0;r < num;r++)
		{
			n[r] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (r = 0;r < num;r++)
		{
			System.out.print(f(n[r]));
			System.out.print('\n');
		}
		return 0;
	}
}

