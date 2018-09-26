package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static int Main()
	{

		int y;
		int m;
		int d;
		int sum;
		int a;
		int b;
		int i;
		int n = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d = Integer.parseInt(tempVar3);
	}
	a = DiJiTian(y, m, d);
	a = a % 7;
	y = y % (365 * 7 * 400);
	for (i = 1;i < y;i++)
	{
		if (isRunNian(i) != 0)
		{
			n += 1;
		}
	}
	b = ((n * 2) % 7) + ((y - 1 - n) % 7);

	sum = a + b;

	switch (sum % 7)
	{

	case 1:
	System.out.print("Mon.");
	break;
	case 2:
	System.out.print("Tue.");
	break;
	case 3:
	System.out.print("Wed.");
	break;
	case 4:
	System.out.print("Thu.");
	break;
	case 5:
	System.out.print("Fri.");
	break;
	case 6:
	System.out.print("Sat.");
	break;
	case 0:
	System.out.print("Sun.");
	break;

	}


	return 0;
	}


}

