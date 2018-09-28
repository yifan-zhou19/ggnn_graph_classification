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

	public static int date(int yy,int mm,int dd)
	{
		int isr = run(yy);
		int[] p = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days = 0;
		for (int i = 1;i < mm;i++)
		{
			days = days + p[i];
		}
		days = days + dd;
		if (isr == 1 && mm >= 3)
		{
			days++;
		}

		return (days);
	}

	public static int Main()
	{
		int yy;
		int mm;
		int dd;
		yy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yy = yy % 2800;
		int days = (yy - 1) * 365;
		days += ((yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400);
		days += date(yy, mm, dd);
		int day = days % 7;
		switch (day)
		{
		case 0:
		System.out.print("Sun.");
		break;
		case 1:
		System.out.print("Mon.");
		break;
			case 2:
			System.out.print("Tue.");
			break;
				case 3:
				System.out.print("Wed.");
				break;
					case 4:
					System.out.print("Thu.");
					break;
						case 5:
						System.out.print("Fri.");
						break;
							case 6:
							System.out.print("Sat.");
							break;
		}

	}
}

