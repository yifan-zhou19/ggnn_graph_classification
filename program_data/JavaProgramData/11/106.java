package <missing>;

public class GlobalMembers
{
	public static int mon(int n)
	{
		int day;
		switch (n)
		{
			case 1 :
				day = 31;
				break;
			case 2 :
				day = 28;
				break;
			case 3 :
				day = 31;
				break;
			case 4 :
				day = 30;
				break;
			case 5 :
				day = 31;
				break;
			case 6 :
				day = 30;
				break;
			case 7 :
				day = 31;
				break;
			case 8 :
				day = 31;
				break;
			case 9 :
				day = 30;
				break;
			case 10:
				day = 31;
				break;
			case 11:
				day = 30;
				break;
			case 12:
				day = 31;
				break;
		}
		return (day);
	}
	public static int run(int year)
	{
		int p;
		if (year % 400 == 0)
		{
			p = 1;
		}
		else if ((year % 100 != 0) && (year % 4 == 0))
		{
			p = 1;
		}
		else
		{
			p = 0;
		}
		return (p);
	}

	public static int Main()
	{
		int year;
		int month;
		int date;
		int i;
		int n = 0;
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
		for (i = 1 ; i <= month - 1 ; i++)
		{
			n = n + mon(i);
		}
		n = n + date;
		if (run(year) == 1)
		{
			n = n + 1;
		}
		else
		{
			n = n;
		}
		System.out.printf("%d", n);

		return (0);
	}
}

