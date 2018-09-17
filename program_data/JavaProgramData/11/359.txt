package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int date;
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			date = Integer.parseInt(tempVar3);
		}
		if (month == 1)
		{
			n = date;
		}
		m = m + 31;
		if (month == 2)
		{
			n = m + date;
		}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				m = m + 29;
			}
			else
			{
				m = m + 28;
			}

		if (month == 3)
		{
			n = m + date;
		}
		m = m + 31;
		if (month == 4)
		{
			n = m + date;
		}
		m = m + 30;
		if (month == 5)
		{
			n = m + date;
		}
		m = m + 31;
		if (month == 6)
		{
			n = m + date;
		}
		m = m + 30;
		if (month == 7)
		{
			n = m + date;
		}
		m = m + 31;
		if (month == 8)
		{
			n = m + date;
		}
		m = m + 31;
		if (month == 9)
		{
			n = m + date;
		}
		m = m + 30;
		if (month == 10)
		{
			n = m + date;
		}
		m = m + 31;
		if (month == 11)
		{
			n = m + date;
		}
		m = m + 30;
		if (month == 12)
		{
			n = m + date;
		}
		System.out.printf("%d\n", n);
	}
}

