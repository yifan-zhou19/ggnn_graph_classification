package <missing>;

public class GlobalMembers
{
	public static int[] ans = new int[21];

	public static int work(int a)
	{
		if (a <= 2)
		{
			return 1;
		}
		return (work(a - 1) + work(a - 2));
	}

	public static int Main()
	{
		int n;
		int a;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(work(a));
			System.out.print("\n");
		}
		return 0;
	}
}

