package <missing>;

public class GlobalMembers
{
	public static int run(int nian)
	{
		if (nian % 400 == 0)
		{
			return 1;
		}
		else
		{
			if (nian % 100 == 0)
			{
				return 0;
			}
			else
			{
				if (nian % 4 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}

	public static int mon(int m,int n)
	{
		switch (m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			if (run(n) != 0)
			{
				return 29;
			}
			else
			{
				return 28;
			}
		}
	}


	public static int Main()
	{
		int year;
		int month;
		int day;
		int date;
		int i;
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
		date = 0;
		for (i = 1;i < month;i++)
		{
			date = date + mon(i, year);
		}
		date = date + day;
		System.out.printf("%d",date);
		return 0;
	}
}

