package <missing>;

public class GlobalMembers
{
	public static int run(int a)
	{
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int y;
		int m;
		int d;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int isr = run(y);
		int[] p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = 0;
		for (int i = 1;i < m;i++)
		{
			days = days + p[i];
		}
		days = days + d;
		if (isr == 1 && m >= 3)
		{
			days++;
		}
		System.out.print(days);
	}
}

