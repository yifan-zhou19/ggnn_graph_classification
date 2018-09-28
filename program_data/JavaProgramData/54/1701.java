package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int p = 1;
	public static int monkey(int t)
	{
		int x = 0;
		if (t == 1)
		{
			return p * n + k;
		}
		else
		{
			while ((monkey(t - 1) % (n - 1) != 0))
			{
				p++;
			}
				return (monkey(t - 1) * n / (n - 1) + k);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(monkey(n));
		System.out.print("\n");
		return 0;
	}


}

