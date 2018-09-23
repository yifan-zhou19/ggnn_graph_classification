package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int result;
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
		result = (month - 1) * 30 + day;
		if (month == 1)
		{
			System.out.printf("%d",result);
		}
		else
		{
			if (month == 2 || month == 4 || month == 5)
			{
				result = result + 1;
			}
			if (month == 6 || month == 7)
			{
				result = result + 2;
			}
			if (month == 8)
			{
				result = result + 3;
			}
			if (month == 9 || month == 10)
			{
				result = result + 4;
			}
			if (month == 11 || month == 12)
			{
				result = result + 5;
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				System.out.printf("%d",result);
			}
			else
			{
				System.out.printf("%d",result - 1);
			}
		}
		return 0;
	}
}

