package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int which;
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
		which = day;
		month--;
		if (month > 0)
		{
			which += 31;
			month--;
		}
		if (month > 0)
		{
			if (year % 4 != 0)
			{
				which += 28;
			}
			else if (year % 100 == 0 && year % 400 != 0)
			{
				which += 28;
			}
			else
			{
				which += 29;
			}
			month--;
		}
		if (month > 0)
		{
			which += 31;
			month--;
		}
		if (month > 0)
		{
			which += 30;
			month--;
		}
		if (month > 0)
		{
			which += 31;
			month--;
		}
		if (month > 0)
		{
			which += 30;
			month--;
		}
		if (month > 0)
		{
			which += 31;
			month--;
		}
		if (month > 0)
		{
			which += 31;
			month--;
		}
		if (month > 0)
		{
			which += 30;
			month--;
		}
		if (month > 0)
		{
			which += 31;
			month--;
		}
		if (month > 0)
		{
			which += 30;
			month--;
		}
		System.out.printf("%d",which);

	}


}

