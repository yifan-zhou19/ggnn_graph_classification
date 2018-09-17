package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{

			int year;
			int month;
			int day;
			int result = 0;

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


		for (int i = 1;i < month;i++)
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
		System.out.printf("%d",result);
		return 0;
	}
}

