package <missing>;

public class GlobalMembers
{
	public static int days(int m1, int m2, int[] e)
	{
		int sum = 0;
		for (int i = m2;i < m1;i++)
		{
			sum += e[i];
		}
		return sum;
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int y;
			int m1;
			int m2;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] e = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
			{
				e[2] = 29;
			}
			int sum;
			if (m1 > m2)
			{
				sum = days(m1, m2, e);
			}
			else
			{
				sum = days(m2, m1, e);
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

