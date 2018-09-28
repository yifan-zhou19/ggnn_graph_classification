package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int year;
		int month;
		int day;
		int sum = 0;
		int mod;
		int i;
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //??????
		{
			days[2] = 29;
			sum += year - 1 + year / 4 - year / 100 + year / 400 - 1;
		}
		else
		{
			sum += year + year / 4 - year / 100 + year / 400 - 1;
		}
		for (i = 1;i < month;i++) //????
		{
			sum += days[i];
		}
		sum += day;
		mod = sum % 7;
		switch (mod)
		{
		case 0:
			System.out.print("Sun.");
			System.out.print("\n");
			break;
		case 1:
			System.out.print("Mon.");
			System.out.print("\n");
			break;
		case 2:
			System.out.print("Tue.");
			System.out.print("\n");
			break;
		case 3:
			System.out.print("Wed.");
			System.out.print("\n");
			break;
		case 4:
			System.out.print("Thu.");
			System.out.print("\n");
			break;
		case 5:
			System.out.print("Fri.");
			System.out.print("\n");
			break;
		case 6:
			System.out.print("Sat.");
			System.out.print("\n");
		}
		return 0;
	}

}

