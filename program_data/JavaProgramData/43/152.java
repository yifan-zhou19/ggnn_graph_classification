package <missing>;

public class GlobalMembers
{
	public static int check(int n)
	{
		if (n == 2)
		{
			return 0;
		}
		for (int i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3;i <= m / 2;i++)
		{
			if (check(i) == 1 && check(m - i) == 1)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(m - i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

