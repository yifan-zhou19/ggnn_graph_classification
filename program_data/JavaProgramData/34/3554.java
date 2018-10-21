package <missing>;

public class GlobalMembers
{
	public static int solve(int a)
	{
		if (a == 1)
		{
			System.out.print("End");
			return 0;
		}
		if (a % 2 == 1)
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(3 * a + 1);
			System.out.print("\n");
			a = 3 * a + 1;
			return solve(a);
		}
		System.out.print(a);
		System.out.print("/2=");
		System.out.print(a / 2);
		System.out.print("\n");
		a = a / 2;
		return solve(a);
	}

	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		solve(x);

	return 0;
	}
}

