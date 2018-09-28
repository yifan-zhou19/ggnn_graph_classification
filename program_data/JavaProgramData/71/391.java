package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int m1;
		int m2;
		int[] md = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5, 1};
		int n;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				m1 ^= m2;
				m2 ^= m1;
				m1 ^= m2;
			}
			if (((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) && (m1 <= 2 && m2>2))
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
			if ((md[m2 - 1] - md[m1 - 1] + k) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

