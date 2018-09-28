package <missing>;

public class GlobalMembers
{
	public static int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int runnian(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int tian(int y, int m, int d)
	{
		int x = 0;
		for (int i = 0;i < m - 1;i++)
		{
			x += md[i];
		}
		x += d;
		if (runnian(y) != 0 && (m > 2 || (m == 2 && d == 29)))
		{
			x++;
		}
		return x;
	}
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int dif = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (y2 - y1 >= 1)
		{
			dif += 365 + runnian(y1);
			y1++;
		}
		dif = dif + (tian(y2, m2, d2) - tian(y1, m1, d1));
		System.out.print(dif);
		System.out.print("\n");
		return 0;
	}
}

