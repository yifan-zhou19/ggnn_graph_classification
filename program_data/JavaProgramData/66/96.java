package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int weekday;
		int total = 0;
		int total1 = 0;
		int i;
		int[][] monthday =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
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
			 year = year % 400 + 400;
		for (i = 1;i < year;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				total = total + 366 % 7;
			}
			else
			{
				total = total + 365 % 7;
			}
		}

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{

				for (i = 0;i < month - 1;i++)
				{
					total1 = total1 + monthday[1][i];
				}
					total = total + total1 % 7;

		}
		else
		{

				for (i = 0;i < month - 1;i++)
				{
					total = total + monthday[0][i];
				}
					total = total + total1 % 7;

		}
		total = total + day % 7;
		weekday = total % 7;

		switch (weekday)
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
	}

}

