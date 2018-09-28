package <missing>;

public class GlobalMembers
{
	public static void CaculateWeekDay(int y,int m, int d)
	{
		if (m == 1 || m == 2)
		{
			m += 12;
			y--;
		}
		int iWeek = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
		switch (iWeek)
		{
		case 0:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		case 6:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		}
	}
	public static int Main()
	{
		int year;
		int month;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		CaculateWeekDay(year, month, day);
		return 0;
	}
}

