package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int sum = 0;
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
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 1;i < year % 400;i++)
			{
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
				{
					sum += 366;
				}
				else
				{
					sum += 365;
				}
			}
		if (year % 400 == 0)
		{
			sum += 5;
		}
		for (i = 0;i < month - 1;i++)
		{
			sum += days[i];
		}
		sum += day;
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2)
		{
			sum++;
		}
		switch (sum % 7)
		{
		  case 0:
			  System.out.print("Sun.\n");
			  break;
		  case 1:
			  System.out.print("Mon.\n");
			  break;
		  case 2:
			  System.out.print("Tue.\n");
			  break;
		  case 3:
			  System.out.print("Wed.\n");
			  break;
		  case 4:
			  System.out.print("Thu.\n");
			  break;
		  case 5:
			  System.out.print("Fri.\n");
			  break;
		  default:
			  System.out.print("Sat.\n");
		}

	}

}

