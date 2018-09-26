package <missing>;

public class GlobalMembers
{
	public static int Is_Runinian(int year)
	{
		if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
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
		int j;
		int k;
		k = (year - 1) % 400;
		int m = 0;
		for (i = 0;i < k;i++)
		{
			if (Is_Runinian(i + 1) == 1)
			{
				m += 366 % 7;
			}
			else
			{
				m += 365 % 7;
			}
		}
		m = m % 7;
		for (j = 1;j < month;j++)
		{
			if ((j < 8 && j % 2 == 1) || (j>7 && j % 2 == 0))
			{
				m += 31 % 7;
			}
			else if (j < 8 && j>2 && j % 2 == 0 || j > 7 && j % 2 == 1)
			{
				m += 30 % 7;
			}
			else if (j == 2 && Is_Runinian(year) == 1)
			{
				m += 29 % 7;
			}
			else
			{
				m += 28 % 7;
			}
		}
		m = m % 7;
		m += day % 7;
		m = m % 7;
		if (m == 0)
		{
			System.out.print("Sun.");
		}
		else if (m == 1)
		{
			System.out.print("Mon.");
		}
		else if (m == 2)
		{
			System.out.print("Tue.");
		}
		else if (m == 3)
		{
			System.out.print("Wed.");
		}
		else if (m == 4)
		{
			System.out.print("Thu.");
		}
		else if (m == 5)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Sat.");
		}
		return 0;
	}





}

