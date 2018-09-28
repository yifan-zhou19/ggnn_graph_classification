package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int t = 0;
		for (int year = 1;year <= y - 1;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				t += 366;
			}
			else
			{
				t += 365;
			}
		}
		int year = y;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			month[2] = 29;
		}
		else
		{
			month[2] = 28;
		}
		for (int i = 1;i <= m - 1;i++)
		{
			t = t + month[i];
		}
		t += d;
		int t2 = t;

		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		t = 0;
		for (int year = 1;year <= y - 1;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				t += 366;
			}
			else
			{
				t += 365;
			}
		}
		year = y;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			month[2] = 29;
		}
		else
		{
			month[2] = 28;
		}
		for (int i = 1;i <= m - 1;i++)
		{
			t = t + month[i];
		}
		t += d;

		System.out.print(Math.abs(t - t2));
		return 0;
	}

}

