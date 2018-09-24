package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
			if (month == 1)
			{
				sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + day;
			}
			else if (month == 2)
			{
				sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 31 + day;
			}
			else
			{
			if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
			{
				if (month == 3)
				{
				sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 60 + day;
				}
				else if (month == 4)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 91 + day;
				}
				else if (month == 5)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 121 + day;
				}
				else if (month == 6)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 152 + day;
				}
				else if (month == 7)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 182 + day;
				}
				else if (month == 8)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 213 + day;
				}
				else if (month == 9)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 244 + day;
				}
				else if (month == 10)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 274 + day;
				}
				else if (month == 11)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 305 + day;
				}
				else if (month == 12)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 335 + day;
				}
			}
			else
			{
				if (month == 3)
				{
				sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 59 + day;
				}
				else if (month == 4)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 90 + day;
				}
				else if (month == 5)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 120 + day;
				}
				else if (month == 6)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 151 + day;
				}
				else if (month == 7)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 181 + day;
				}
				else if (month == 8)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 212 + day;
				}
				else if (month == 9)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 243 + day;
				}
				else if (month == 10)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 273 + day;
				}
				else if (month == 11)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 304 + day;
				}
				else if (month == 12)
				{
					sum = 365 * ((year - 1) % 7) + ((year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100) + 334 + day;
				}
			}
			}
			if (sum % 7 == 0)
			{
				System.out.print("Sun.\n");
			}
			else if (sum % 7 == 1)
			{
				System.out.print("Mon.\n");
			}
			else if (sum % 7 == 2)
			{
				System.out.print("Tue.\n");
			}
			else if (sum % 7 == 3)
			{
				System.out.print("Wed.\n");
			}
			else if (sum % 7 == 4)
			{
				System.out.print("Thu.\n");
			}
			else if (sum % 7 == 5)
			{
				System.out.print("Fri.\n");
			}
			else if (sum % 7 == 6)
			{
				System.out.print("Sat.\n");
			}
	}
}

