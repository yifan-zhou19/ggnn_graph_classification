package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int styear;
		int stmonth;
		int stday;
		int edyear;
		int edmonth;
		int edday;
		int month;
		int year;
		int sum = 0;
		styear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		stmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		stday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		edyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		edmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		edday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (edyear == styear)
		{
			if (edmonth == stmonth)
			{
				sum = edday - stday;
			}
			else
			{
				for (month = stmonth;month <= edmonth - 1;month++)
				{
					switch (month)
					{
					case 2:
						sum += 28;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						sum += 31;
						break;
					default:
						sum += 30;
						break;
					}
				}
				if (((styear % 4 == 0 && styear % 100 != 0) || (styear % 400 == 0)) && stmonth <= 2 && edmonth>2)
				{
					sum++;
				}
				sum = sum + edday - stday;
			}
		}
		else
		{
			for (year = styear;year <= edyear;year++)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					sum += 366;
				}
				else
				{
					sum += 365;
				}
			}
			if (stmonth > 1)
			{
				for (month = 1;month <= stmonth - 1;month++)
				{
					switch (month)
					{
					case 2:
						sum -= 28;
						break;
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						sum -= 31;
						break;
					default:
						sum -= 30;
						break;
					}
				}
				if (((styear % 4 == 0 && styear % 100 != 0) || (styear % 400 == 0)) && stmonth > 2)
				{
					sum -= 1;
				}
			}
			sum -= stday;
			for (month = edmonth;month <= 12;month++)
			{
				switch (month)
				{
				case 2:
					sum -= 28;
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					sum -= 31;
					break;
				default:
					sum -= 30;
					break;
				}
			}
			if (((edyear % 4 == 0 && edyear % 100 != 0) || (edyear % 400 == 0)) && edmonth <= 2)
			{
				sum -= 1;
			}
			sum += edday;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

