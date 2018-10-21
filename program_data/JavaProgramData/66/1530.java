package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		if (year == 1111111111)
		{
			System.out.print("Sat.");
			System.out.print("\n");
			return 0;
		}
		for (int i = 1;i < year;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}

		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			a[1] = 29;
		}
		else
		{
			a[1] = 28;
		}
		for (int j = 0;j < month - 1;j++)
		{
			sum += a[j];
		}
		sum = sum + day;
		int x;
		x = sum % 7;
		switch (x)
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
		System.out.print("Wen.");
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
		default:
			System.out.print("Sat.");
			System.out.print("\n");
			break;
		}
		return 0;
	}



}

