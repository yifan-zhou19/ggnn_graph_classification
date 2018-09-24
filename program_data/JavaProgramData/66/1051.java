package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int yea;
		int month;
		int day;
		int sum;
		int n;
		int i;
		sum = 0;
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
		if (year >= 400)
		{
			yea = year;
			while (yea >= 400)
			{
		yea = yea - 400;
		sum = 5;
			}

		for (i = 0;i < yea;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		}
	else
	{
			for (i = 1;i < year;i++)
			{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
			}


	}





		for (i = 1;i < month;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				sum = sum + 31;
			}
			if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			{
				sum = sum + 30;
			}
			if (i == 2)
			{
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				{
						sum = sum + 29;
				}
				else
				{
					sum = sum + 28;
				}
			}
		}
		sum = sum + day;
		n = sum % 7;
		switch (n)
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

