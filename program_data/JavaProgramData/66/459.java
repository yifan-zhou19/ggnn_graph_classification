package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
		{ //step1
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
		result += day; //step2
		return result;
	}
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
	public static int Main()
	{
		int year2;
		int month2;
		int day2;
		int q;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year2 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day2 = Integer.parseInt(tempVar3);
		}
		w = (int)(year2 - 1) + (int)((year2 - 1) / 4) - (int)((year2 - 1) / 100) + (int)((year2 - 1) / 400) + DiJiTian(year2, month2, day2);
		q = w % 7;
		 switch (q)
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
		 }
		 return 0;
	}

}

