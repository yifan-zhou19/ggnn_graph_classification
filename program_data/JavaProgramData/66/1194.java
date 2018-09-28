package <missing>;

public class GlobalMembers
{
	public static int isrunnian(int year)
	{
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
		return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int year;
		int month;
		int date;
		int sum;
		int[][] montha =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
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
			date = Integer.parseInt(tempVar3);
		}
		sum = (year % 7 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400) % 7;
		for (i = 0;i < month - 1;i++)
		{
							 sum += montha[isrunnian(year)][i] % 7;
		}

		sum += date-1;



		int d;
		d = sum % 7;

		if (d == 1)
		{
		System.out.print("Mon.");
		}
		if (d == 2)
		{
		System.out.print("Tue.");
		}
		if (d == 3)
		{
		System.out.print("Wed.");
		}
		if (d == 4)
		{
		System.out.print("Thu.");
		}
		if (d == 5)
		{
		System.out.print("Fri.");
		}
		if (d == 6)
		{
		System.out.print("Sat.");
		}
		if (d == 0)
		{
		System.out.print("Sun.");
		}

					return 0;
	}
}

