package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month1 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		int sum = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] y = {365, 366};
		for (int i = 1;i < year % 400 + 400;i++)
		{
			if (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))
			{
				sum += y[0] % 7;
			}
			else
			{
				sum += y[1] % 7;
			}
		}
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
		{
			month1[1] = 28;
		}
		else
		{
			month1[1] = 29;
		}
		for (int i = 0;i < month - 1;i++)
		{
			sum += month1[i] % 7;
		}
		sum += day % 7;
		int w = (sum - 1) % 7;
		switch (w)
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
			System.out.print("Wen.");
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
		default:
			break;
		}

		return 0;
	}
}

