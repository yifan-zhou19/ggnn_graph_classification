package <missing>;

public class GlobalMembers
{
	public static int run_check(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		return 0;
	}

	public static int[] days_in_months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int ans = 0;

		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = sy + 1; i < ey; i++)
		{
			ans += run_check(i) + 365;
		}

		if (sy != ey)
		{
			for (int i = sm + 1; i <= 12; i++)
			{
				ans += days_in_months[i];
				if (i == 2)
				{
					ans += run_check(sy);
				}
			}
			for (int i = 1; i < em; i++)
			{
				ans += days_in_months[i];
				if (i == 2)
				{
					ans += run_check(ey);
				}
			}
		}
		else
		{
			for (int i = sm + 1; i < em; i++)
			{
				ans += days_in_months[i];
				if (i == 2)
				{
					ans += run_check(sy);
				}
			}
		}

		if (sy != ey || sm != em)
		{
			for (int i = sd; i <= days_in_months[sm]; i++)
			{
				ans++;
			}
			if (sm == 2)
			{
				ans += run_check(sy);
			}
			for (int i = 1; i < ed; i++)
			{
				ans++;
			}
		}
		else
		{
			for (int i = sd; i < ed; i++)
			{
				ans++;
			}
		}
		System.out.print(ans);
		return 0;
	}

}

