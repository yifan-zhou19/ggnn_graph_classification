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
		int[] montha = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		sum = (year % 7 + year / 4 - year / 100 + year / 400);
		for (i = 1;i < month;i++)
		{
							 sum += montha[i];
		}

		sum += date-1;
		if (isrunnian(year) != 0 && (month <= 2))
		{
						   sum--;
		}
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

