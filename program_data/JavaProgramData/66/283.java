package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int dayName;
		int sum = 0;
		int i;
		int j;
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
		sum += sum + year - 1 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		sum = sum % 7;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
				continue;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
				continue;
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				 sum += 29;
			}
			else
			{
				sum += 28;
			}
		}
		sum += day;
		dayName = sum % 7;
		switch (dayName)
		{
			case 1 :
				System.out.print("Mon.");
				break;
			case 2 :
				System.out.print("Tue.");
				break;
			case 3 :
				System.out.print("Wen.");
				break;
			case 4 :
				System.out.print("Thu.");
				break;
			case 5 :
				System.out.print("Fri.");
				break;
			case 6 :
				System.out.print("Sat.");
				break;
			case 0 :
				System.out.print("Sun.");
				break;
		}





	}
}

