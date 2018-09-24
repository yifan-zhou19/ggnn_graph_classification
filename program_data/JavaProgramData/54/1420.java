package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int b = 1;
	public static int calc(int x)
	{
		if (x == 1)
		{
			return b * n + k;
		}
		if (calc(x - 1) == 0 || calc(x - 1) % (n - 1) != 0)
		{
			return 0;
		}
		return calc(x - 1) / (n - 1) * n + k;
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (calc(n) == 0)
			{
				b++;
				continue;
			}
			System.out.print(calc(n));
			break;
		}
		return 0;
	}
}

