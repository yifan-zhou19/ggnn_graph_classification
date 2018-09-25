package <missing>;

public class GlobalMembers
{
	public static int dt(int m,int n)
	{
		int re = 0;
		if (m >= n)
		{
			re += dt(m - n, n);
		}
		if (n > 1)
		{
			re += dt(m, n - 1);
		}
		if (m <= 1 && n <= 1)
		{
			re = 1;
		}
		return re;
	}


	public static int Main()
	{

		int t = 0;

		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0;i < t;i++)
		{

			int m;
			int n;

			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			System.out.print(dt(m, n));

			if (i < t - 1)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}




}

