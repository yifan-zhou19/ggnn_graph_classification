package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Ans = 0;
		int y;
		int m;
		int d;
		int yy = 0;
		int[] M = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
		{
		M[1]++;
		}
		for (int i = 0;i < m - 1;i++)
		{
		Ans += M[i];
		}
		Ans += d;
		if (y > 400 && y % 400 != 0)
		{
			y = y % 400;
		}
			if (y % 400 == 0)
			{
			y = 400;
			}
		for (int i = 1;i < y;i++)
		{
		if (i % 400 == 0 || (i % 100 != 0 && i % 4 == 0))
		{
		Ans += 2;
		}
		else
		{
			Ans++;
		}
		}
		Ans = (Ans) % 7;
		System.out.print(week[Ans]);
		System.out.print(".");
		System.out.print("\n");
		return 0;
	}


}

