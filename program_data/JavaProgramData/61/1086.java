package <missing>;

public class GlobalMembers
{
	public static int f(int af)
	{
		if (af == 1 || af == 2)
		{
			return 1;
		}
		return f(af - 1) + f(af - 2);
	}
	public static int Main()
	{
		int n;
		int m;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = f(k);
			System.out.print(m);
			System.out.print("\n");
		}
		return 0;
	}
}

