package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int k = 0;

	public static int f(int depth,int a)
	{
		if (depth == n)
		{
			return a;
		}
		if (a % (n - 1) == 0)
		{
			return f(depth + 1, a * n / (n - 1) + k);
		}
		return 0;
	}

	public static int Main()
	{
		int i = 1;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			t = f(1, i * n + k);
			if (t != 0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		System.out.print(t);
		return 0;
	}
}

