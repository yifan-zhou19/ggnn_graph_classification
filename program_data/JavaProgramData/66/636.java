package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
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
		int i;
		int s;
		s = year % 400;
		if (s == 0)
		{
			s += 400;
		}
		int sum = 0;
		for (i = 1;i < s;i++)
		{
			if (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))
			{
				sum++;
			}
			else if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 2;
			}
		}
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sum += 3;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 2;
			}
			else if (i == 2 && (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)))
			{
				sum += 0;
			}
			else if (i == 2 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				sum += 1;
			}
		}
		sum += day;
		int t = sum % 7;
		if (t == 1)
		{
			System.out.print("Mon.");
		}
		else if (t == 2)
		{
			System.out.print("Tue.");
		}
		else if (t == 3)
		{
			System.out.print("Wed.");
		}
		else if (t == 4)
		{
			System.out.print("Thu.");
		}
		else if (t == 5)
		{
			System.out.print("Fri.");
		}
		else if (t == 6)
		{
			System.out.print("Sat.");
		}
		else if (t == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

