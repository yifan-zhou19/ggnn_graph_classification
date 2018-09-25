package <missing>;

public class GlobalMembers
{
	public static int god(int y, int m, int d)
	{
		int sum = 0;
		int ctr;
		for (ctr = 1;ctr < y;ctr++)
		{
			if ((ctr % 4 == 0 && ctr % 100 != 0) || (ctr % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		switch (m)
		{
		case 12:
			sum += 30;
		case 11:
			sum += 31;
		case 10:
			sum += 30;
		case 9:
			sum += 31;
		case 8:
			sum += 31;
		case 7:
			sum += 30;
		case 6:
			sum += 31;
		case 5:
			sum += 30;
		case 4:
			sum += 31;
		case 3:
		{
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			{
				sum += 29;
			}
			else
			{
				sum += 28;
			}
		}
		case 2:
			sum += 31;
		case 1:
		default:
			sum += d;
			break;
		}

		   return sum;
	}
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
			System.out.printf("%d",god(year2, month2, day2) - god(year1, month1, day1));

		System.in.read();
		return 0;
	}


}

