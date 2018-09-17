package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int nFactor = new int(int n, int border);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n >= 1; n--)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(nFactor(a, a));
			System.out.print("\n");
		}
		return 0;
	}

	public static int nFactor(int n, int border)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			int i;
			int sum = 0;
			for (i = border; i >= 2; i--)
			{
				if (n % i == 0)
				{
					sum += nFactor(n / i, i);
				}
			}
			return sum;
		}
	}

}

