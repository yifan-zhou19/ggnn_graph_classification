package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int date;
	int days = 0;
	int yearleft;
	year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	date = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	yearleft = year % 400;
	if (yearleft == 0)
	{
	yearleft = 400;
	}
	for (int i = 1;i < yearleft;i++)
	{
		if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
		{
			days += 2;
		}
		else
		{
			days += 1;
		}
	}


	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	{
	for (int i = 1;i < month;i++)
	{
		days += b[i];
	}
	days += date;
	}
	else
	{
		for (int i = 1;i < month;i++)
		{
		days += a[i];
		}
	days += date;
	}
	switch ((days) % 7)
	{
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
		break;
	case 0:
		System.out.print("Sun.");
		System.out.print("\n");
		break;
	};
	return 0;
	}

}

