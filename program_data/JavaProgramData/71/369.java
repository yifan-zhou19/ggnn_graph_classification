package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int mo1;
	int mo2;
	int i;
	int j;
	int n;
	int temp;
	int specialY;
	int day;
	int dayinMonth;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
	year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	mo1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	mo2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	specialY = 0;
	day = 0;
	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	{
	specialY = 1;
	}
	if (mo1 > mo2)
	{
	temp = mo1;
	mo1 = mo2;
	mo2 = temp;
	}
	for (j = mo1; j < mo2; j++)
	{
	switch (j)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayinMonth = 31;
			break;
		case 2:
			if (specialY == 1)
			{
				dayinMonth = 29;
			}
				else
				{
					dayinMonth = 28;
				}
				break;
		case 4:
		case 6:
		case 9:
		case 11:
			dayinMonth = 30;
			break;
		default:
			;
	}
	day += dayinMonth;
	}
	if (day % 7 == 0)
	{
	System.out.print("YES");
	System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	}
	return 0;
	}
}

