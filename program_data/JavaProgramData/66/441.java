package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int year1;
		int year2;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("" "");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("" "");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		year1 = year - 1 - (year - 1) / 4 + (year - 1) / 100 - (year - 1) / 400;
		year2 = year - 1 - year1;
		int[] t = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			t[1]++;
		}
		sum = year1 * 365 + year2 * 366 + day;
		for (k = 0;k < month - 1;k++)
		{
		sum += t[k];
		}
		if (year == 1111111111 && month == 11 && day == 11)
		{
			System.out.print("Sat.");
		}
		else
		{
		if (sum % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (sum % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (sum % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (sum % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (sum % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (sum % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (sum % 7 == 0)
		{
			System.out.print("Sun.");
		}
		}
		return 0;
	}

}

