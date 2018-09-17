package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int isrunnian = int;
		int year;
		int month;
		int day;
		int result = 0;
		int i;
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
		for (i = 1;i < month;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				result = result + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				result = result + 30;
				break;
			case 2:
				if (isrunnian(year) != 0)
				{
					result = result + 29;
				}
				else
				{
					result = result + 28;
				}
				break;
			}
		}
		result = result + day;
		System.out.printf("%d\n",result);
	}

	public static int isrunnian(int year)
	{
		if (year % 400 == 0)
		{
			return 1;
		}
		else if (year % 4 == 0 && year % 100 != 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}

