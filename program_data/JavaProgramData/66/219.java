package <missing>;

public class GlobalMembers
{
	public static int runnian(int year)
	{
		int p = 0;
		if (!(year % 4) && year % 100 || !(year % 400))
		{
			p = 1;
		}
		return p;
	}
	public static int Main()
	{
		int month;
		int day;
		int j;
		 int year;
		float total;
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
			total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
			if (month <= 2)
			{
				total += (month - 1) * 31 + day;
			}
			else
			{

					if (month == 9 || month == 11)
					{
						total += (month - 1) * 30 + month / 2 - 1 + day;
					}
					else
					{
						total += (month - 1) * 30 + month / 2 - 2 + day;
					}
				   if (runnian(year) != 0)
				   {
					   total += 1;
				   }

			}
			j = (int)total % 7;

			switch (j)
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
			case 6:
				System.out.print("Sat.\n");
				break;
			}

		return 0;
	}

}

