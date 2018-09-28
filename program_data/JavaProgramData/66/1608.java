package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		long y;
		long m;
		long d;
		long flag1 = 0;
		long week = 0;
		long sum = 0;
		y = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		m = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		d = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		sum = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
				flag1 = 1;
		}
		for (int i = 0;i < m - 1;i++)
		{
			sum += num[flag1][i] % 7;
		}
		sum += d % 7 - 1;
		week = sum % 7;
		switch (week)
		{
		case 0:
			System.out.print("Mon.");
			break;
		case 1:
			System.out.print("Tue.");
			break;
		case 2:
			System.out.print("Wed.");
			break;
		case 3:
			System.out.print("Thu.");
			break;
		case 4:
			System.out.print("Fri.");
			break;
		case 5:
			System.out.print("Sat.");
			break;
		case 6:
			System.out.print("Sun.");
			break;
		}
		return 0;
	}

}

