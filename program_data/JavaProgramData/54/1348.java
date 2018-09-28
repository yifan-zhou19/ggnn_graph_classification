package <missing>;

public class GlobalMembers
{
	public static int i = 1;
	public static int n;
	public static int k;
	public static int f(int x)
	{
		if (x == 1)
		{
			return (i * n + k);
		}
		else if (f(x - 1) % (n - 1) == 0)
		{
			return (f(x - 1) * n / (n - 1) + k);
		}
		else
		{
				while (f(x - 1) % (n - 1) != 0)
				{
			i++;
				}
			return (f(x - 1) * n / (n - 1) + k);
		}
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(n));

	}

}

