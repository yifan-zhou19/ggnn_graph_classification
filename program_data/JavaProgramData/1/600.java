package <missing>;

public class GlobalMembers
{
	public static int f(int a, int b)
	{
		int k = 0;
		if (a >= 2 * b)
		{
			for (int i = b; i <= a / b; i++)
			{
				if (a % i == 0 && a / i >= i)
				{
					k += f(a / i, i) + 1;
				}
			}
		}
		else
		{
			k = 0;
		}
		return k;
	}

	public static int Main()
	{
		int n;
		int a;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = f(a, 2) + 1;
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}

}

