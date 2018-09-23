package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int n;
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
		if (month == 1)
		{
			n = day;
		}
		else if (month == 2)
		{
			n = 31 + day;
		}
		else if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0)
		{
			if (month < 8)
			{
						if (month % 2 == 0)
						{
							n = 31 * (month - 1) - 2 - month / 2 + day;
						}
						else
						{
							n = 31 * (month - 1) - 2 - (month - 1) / 2 + day;
						}
			}
			else
			{
				if (month % 2 == 0)
				{
					n = 31 * 4 + 28 + 30 * 2 + (month - 8) * 31 - (month / 2 - 5) + day;
				}
				else
				{
					n = 31 * 4 + 28 + 60 + (month - 8) * 31 - ((month - 1) / 2 - 4) + day;
				}
			}
		}
		else
		{
				if (month < 8)
				{
						if (month % 2 == 0)
						{
							n = 31 * (month - 1) - 1 - month / 2 + day;
						}
						else
						{
							n = 31 * (month - 1) - 1 - (month - 1) / 2 + day;
						}
				}
			else
			{
				if (month % 2 == 0)
				{
					n = 31 * 4 + 29 + 30 * 2 + (month - 8) * 31 - (month / 2 - 5) + day;
				}
				else
				{
					n = 31 * 4 + 29 + 60 + (month - 8) * 31 - ((month - 1) / 2 - 4) + day;
				}
			}
		}
				System.out.printf("%d\n",n);
		return 0;
	}
}

