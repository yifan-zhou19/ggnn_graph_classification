package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int leap;
		int days;
		int month;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			days = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
			if (month1 > month2)
			{
				for (month = month2; month < month1; month++)
				{
					switch (month)
					{
						case 1 :
						case 3 :
						case 5 :
						case 7 :
						case 8 :
						case 10 :
						case 12 :
							days += 31;
							break;
						case 4 :
						case 6 :
						case 9 :
						case 11 :
							days += 30;
							break;
						case 2 :
							days += 28 + leap;
							break;
					}
				}
			}
			if (month1 < month2)
			{
				for (month = month1; month < month2; month++)
				{
					switch (month)
					{
						case 1 :
						case 3 :
						case 5 :
						case 7 :
						case 8 :
						case 10 :
						case 12 :
							days += 31;
							break;
						case 4 :
						case 6 :
						case 9 :
						case 11 :
							days += 30;
							break;
						case 2 :
							days += 28 + leap;
							break;
					}
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
		}
		return 0;
	}
}

