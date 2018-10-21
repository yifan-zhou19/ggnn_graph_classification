package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int num = 0;
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
		if (year % 4 != 0 || (year % 100 == 0 && year / 400 != 0))
		{
			switch (month - 1)
			{
				case 11:
					num += 30;
				case 10:
					num += 31;
				case 9:
					num += 30;
				case 8:
					num += 31;
				case 7:
					num += 31;
				case 6:
					num += 30;
				case 5:
					num += 31;
				case 4:
					num += 30;
				case 3:
					num += 31;
				case 2:
					num += 28;
				case 1:
					num += 31;
				case 0:
					;
					break;
			}
			num += day;
		}
		else
		{
			switch (month - 1)
			{
				case 11:
					num += 30;
				case 10:
					num += 31;
				case 9:
					num += 30;
				case 8:
					num += 31;
				case 7:
					num += 31;
				case 6:
					num += 30;
				case 5:
					num += 31;
				case 4:
					num += 30;
				case 3:
					num += 31;
				case 2:
					num += 29;
				case 1:
					num += 31;
				case 0:
					;
					break;
			}
			num += day;
		}
		System.out.printf("%d\n",num);
	}
}

