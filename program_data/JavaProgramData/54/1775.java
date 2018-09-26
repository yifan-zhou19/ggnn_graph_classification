package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int cnt;
	public static int f(int a)
	{
		if (a == 1)
		{
		return n * cnt + k;
		}
		int d = n * f(a - 1);
		if (d % (n - 1) == 0 && d != 0)
		{
		return n * f(a - 1) / (n - 1) + k;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (cnt = 1;;cnt++)
		{
			c = f(n);
			if (c != 0)
			{
			break;
			}
		}
		System.out.print(c);
		System.out.print("\n");

		return 0;
	}

}

