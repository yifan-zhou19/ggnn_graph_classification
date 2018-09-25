package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int days = 0;
		int i;
		int detmonth;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (month1 > month2)
		{
				a = month2;
			month2 = month1;
			month1 = a;
		}
		detmonth = month2 - month1;
		for (;detmonth > 0;month1++,detmonth--)
		{
				if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11)
				{
				days += 30;
				}
			else if (month1 == 2)
			{
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				{
					days += 29;
				}
					else
					{
						days += 28;
					}
			}
			else
			{
				days += 31;
			}
		}
		if (days % 7 == 0)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		days = 0;
		}
		return 0;
	}
}

