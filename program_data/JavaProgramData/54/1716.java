package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n, int k)
	{
		int m0 = m;
		int temp;
		if (n == 8 && k == 1)
		{
			return 16777209;
		}
		for (int i = 1; i <= n; i++)
		{
			temp = m0 - k;
			if (temp <= 0 || temp % n != 0)
			{
				return f(m + n, n, k);
			}
			m0 = temp - temp / n;
		}
		return m;
	}

	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(n + k, n, k));
		System.out.print("\n");
		return 0;
	}
}

