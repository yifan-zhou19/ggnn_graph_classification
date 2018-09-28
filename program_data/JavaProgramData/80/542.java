package <missing>;

public class GlobalMembers
{
	public static int Is(int year)
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int y;
		int m;
		int d = 0;
		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (sy == ey)
		{
			if (sm == em)
			{
				d = ed - sd;
			}
			else
			{
				if (Is(sy) != 0)
				{
					a[1] = 29;
				}
				else
				{
					a[1] = 28;
				}
				for (m = sm + 1;m <= em - 1;m++)
				{
					d = d + a[m - 1];
				}
				d = d + a[sm - 1] - sd + ed;
			}
		}
		else
		{
			if (Is(sy) != 0)
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			d = d + a[sm - 1] - sd;
			for (m = sm + 1;m <= 12;m++)
			{
				d = d + a[m - 1];
			}
			if (Is(ey) != 0)
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			d = d + ed;
			for (m = 1;m <= em - 1;m++)
			{
				d = d + a[m - 1];
			}
			for (y = sy + 1;y <= ey - 1;y++)
			{
				if (Is(y) != 0)
				{
					d = d + 366;
				}
				else
				{
					d = d + 365;
				}
			}
		}

		System.out.print(d);
		System.out.print("\n");


		return 0;
	}
}

