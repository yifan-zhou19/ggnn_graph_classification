package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
		if (m % 4 != 0 || (m % 100 == 0 && m % 400 != 0))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
	public static int[][] month =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int Main()
	{
		int Year;
		int Month;
		int Day;
		int Week;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			Month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			Day = Integer.parseInt(tempVar3);
		}
		int sum = (((Year - 1) / 4 - (Year - 1) / 100 + (Year - 1) / 400) % 7) * 366 + ((Year - 1 - (((Year - 1) / 4 - (Year - 1) / 100 + (Year - 1) / 400) % 7)) % 7) * 365;
		for (i = 0;i < Month - 1;i++)
		{
			sum = sum + month[0][i];
		}
		for (i = 1;i < Day;i++)
		{
			sum = sum + 1;
		}
		if (Month > 2)
		{
			if (f(Year) != 0)
			{
				sum = sum + 1;
			}
		}
		Week = sum % 7;
		System.out.printf("%s",week[Week]);
		System.out.print("\n");
		return 0;
	}



}

