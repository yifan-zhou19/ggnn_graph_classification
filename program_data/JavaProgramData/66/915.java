package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year = 0;
		int month = 0;
		int day = 0;
		int i;
		int number = 0;
		int k;
		int y;
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
			day = Integer.parseInt(tempVar3);
		}
		y = year - 1;
		number = y + y / 4 - y / 100 + y / 400;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				number += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				number += 30;
			}
			else if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					number += 29;
				}
				else
				{
					number += 28;
				}
			}
		}
		number += day;
		k = number % 7;
		if (k == 1)
		{
			System.out.print("Mon.");
		}
		else if (k == 2)
		{
			System.out.print("Tue.");
		}
		else if (k == 3)
		{
			System.out.print("Wed.");
		}
		else if (k == 4)
		{
			System.out.print("Thu.");
		}
		else if (k == 5)
		{
			System.out.print("Fri.");
		}
		else if (k == 6)
		{
			System.out.print("Sat.");
		}
		else if (k == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

