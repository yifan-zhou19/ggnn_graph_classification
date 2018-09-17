package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int dg(int m, int limit)
	{
		for (int i = limit;i <= m / 2;i++)
		{
			if (m % i == 0)
			{
				dg(m / i, i);
			}
		}
		if (m >= limit)
		{
			num++;
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 0;
			dg(m, 2);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}


}

