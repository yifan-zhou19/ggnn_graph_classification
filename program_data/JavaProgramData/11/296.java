package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int x;
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
		switch (month)
		{
		case 1:
			x = day;
			break;
		case 2:
			x = 31 + day;
			break;
		case 3:
			x = 31 + 28 + day;
			break;
		case 4:
			x = 31 + 28 + 31 + day;
			break;
		case 5:
			x = 31 + 28 + 31 + 30 + day;
			break;
		case 6:
			x = 31 + 28 + 31 + 30 + 31 + day;
			break;
		case 7:
			x = 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
		case 10:
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
		case 12:
			x = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;
		}
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					if (month >= 3)
					{
					System.out.printf("%d",x + 1);
					}
					else
					{
					System.out.printf("%d",x);
					}
				}
				else
				{
					System.out.printf("%d",x);
				}
			}
			else
			{
				if (month >= 3)
				{
					System.out.printf("%d",x + 1);
				}
					else
					{
					System.out.printf("%d",x);
					}
			}
		}
		else
		{
			System.out.printf("%d",x);
		}


	}
}

