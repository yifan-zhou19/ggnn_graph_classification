package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//



	public static int baifang(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m == 1)
		{
			return 1;
		}
		if (m == 0)
		{
			return 1;
		}
		if (m < 0)
		{
			return 0;
		}
		if (n > 1)
		{
			sum = baifang(m, n - 1) + baifang(m - n, n);
		}

		return sum;
	}
	public static int sum = 0;

	public static int Main()
	{
		int m = 0;
		int n = 0;

		int t = 0;
		int i = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			System.out.print(baifang(m, n));
			System.out.print("\n");
		}

		return 0;
	}



}

