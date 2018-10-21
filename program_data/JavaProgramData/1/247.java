package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void check(int m, int n)
	{
		for (;m <= n; m++)
		{
			if (n % m == 0)
			{
				if (n / m == 1)
				{
					num++;
					return;
				}
				else
				{
					check(m, n / m);
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n != 0; n--)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			check(2, m);
			System.out.print(num);
			System.out.print("\n");
			num = 0;
		}
		return 0;
	}
}

