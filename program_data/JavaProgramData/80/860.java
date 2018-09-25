package <missing>;

public class GlobalMembers
{
	public static final int[] day1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static final int[] day2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int i;
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int ans = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1; i <= y2 - 1; i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				ans = ans + 366;
			}
			else
			{
				ans = ans + 365;
			}
		}
		for (i = 1; i < m1; i++)
		{
			if (((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0))
			{
				ans = ans - day2[i];
			}
			else
			{
				ans = ans - day1[i];
			}
		}
		ans = ans - d1;
		for (i = 1; i < m2; i++)
		{
			if (((y2 % 4 == 0) && (y2 % 100 != 0)) || (y2 % 400 == 0))
			{
				ans = ans + day2[i];
			}
			else
			{
				ans = ans + day1[i];
			}
		}
		ans = ans + d2;
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

