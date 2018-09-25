package <missing>;

public class GlobalMembers
{
	public static int[] year = new int[3001];
	public static int remain(int y, int m, int d)
	{
		int k = 0;
		int i;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year[y] == 365)
		{
			k += month[m] - d;
			for (i = m + 1;i <= 12;i++)
			{
				k += month[i];
			}
		}
		else
		{
			month[2] = 29;
			k += month[m] - d;
			for (i = m + 1;i <= 12;i++)
			{
				k += month[i];
			}
		}
		return k;
	}
	public static int Main()
	{
		int i;
		int sum = 0;
		int year1;
		int mon1;
		int day1;
		int year2;
		int mon2;
		int day2;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 3000;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				year[i] = 366;
			}
			else
			{
				year[i] = 365;
			}
		}
		if (year1 < year2)
		{
			for (i = year1 + 1;i < year2;i++)
			{
				sum += year[i];
			}
			sum += remain(year1, mon1, day1) + year[year2] - remain(year2, mon2, day2);
		}
		else if (year1 == year2)
		{
			sum += remain(year1, mon1, day1) - remain(year2, mon2, day2);
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

