package <missing>;

public class GlobalMembers
{
	public static int d(int y, int m)
	{
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
		{
			return 31;
		}
		if (m != 2)
		{
			return 30;
		}
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			return 29;
		}
		return 28;
	}
	public static int Main()
	{
		int n;
		int y;
		int i;
		int m1;
		int m2;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				int change = m1;
				m1 = m2;
				m2 = change;
			}
			for (;m1 < m2;m1++)
			{
				sum += d(y, m1);
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

