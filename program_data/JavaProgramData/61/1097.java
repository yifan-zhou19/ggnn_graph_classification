package <missing>;

public class GlobalMembers
{
	//2013.11.23
	//zwb

	public static int n;
	public static int i;
	public static int j = 1;
	public static int m;
	public static int[] num = new int[21];
	public static int fib(int m)
	{
		if (m == 1 || m == 2)
		{
			return 1;
		}
		else
		{
			return fib(m - 1) + fib(m - 2);
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[m] = fib(m);
			System.out.print(num[m]);
			System.out.print("\n");
		}
		return 0;
	}

}

