package <missing>;

public class GlobalMembers
{
	public static int Inyear(int month,int day,int year,int i,int output)
	{
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				output += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				output += 30;
			}
			else if (i == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
			{
				output += 29;
			}
			else
			{
				output += 28;
			}
		}
		output += day;
		return output;
	}

	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int output = 0;
		int inyear;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day[0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year[1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month[1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day[1] = Integer.parseInt(tempVar6);
		}
		output = Inyear(month[1], day[1], year[1], i, inyear) - Inyear(month[0], day[0], year[0], i, inyear);
		for (i = year[0];i < year[1];i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				output += 366;
			}
			else
			{
				output += 365;
			}
		}
		System.out.printf("%d",output);
		return 0;
	}

}

