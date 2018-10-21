package <missing>;

public class GlobalMembers
{
	public static int isLeapYear(int y)
	{
		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static int Main()
	{
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int sum = 0;
		int i;
		int j;
		int index;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		j = y - 1;
		if (y > 400)
		{
			sum = 5;
			j = y % 400;
		}
		for (i = y - j; i < y; i++)
		{
			if (isLeapYear(i) != 0)
			{
				sum += 2;
			}
			else
			{
				sum += 1;
			}
			sum %= 7;
		}
		if (isLeapYear(y) != 0)
		{
			days[1]++; // ????29?
		}
		for (i = 1; i < m; i++)
		{
			sum += days[i - 1];
		}
		sum += d;
		index = sum % 7;
		System.out.printf("%s", week[index]);

		return 0;
	}

}

