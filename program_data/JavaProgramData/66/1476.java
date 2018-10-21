package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int star = 1;
		int year;
		int month;
		int day;
		int[] month1 = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3, 0};
		int[] month2 = {3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3, 0};
		int i;
		int p;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year = year % 400;
		if (year != 0)
		{
		for (i = 1;i < year;i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				star += 2;
			}
			else
			{
				star += 1;
			}
			if (star > 7)
			{
				star -= 7;
			}
		}
		}
		else
		{
		star = 6;
		}
		if (year % 4 == 0 && year % 100 != 0)
		{
			for (i = 1;i < month;i++)
			{
				star += month2[i - 1];
				if (star > 7)
				{
					star -= 7;
				}
			}
		}
		else
		{
			for (i = 1;i < month;i++)
			{
				star += month1[i - 1];
				if (star > 7)
				{
					star -= 7;
				}
			}
		}
		star += (day - 1) % 7;
		if (star > 7)
		{
			star -= 7;
		}
		switch (star)
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
			case 6:
				System.out.print("Sat.");
				System.out.print("\n");
				break;
			case 7:
				System.out.print("Sun.");
				System.out.print("\n");
				break;
			default:
				break;
		}
		return 0;
	}
}

