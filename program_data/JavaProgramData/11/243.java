package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		short month;
		short day;
		short result = 0;
		short i = 1;
		char odd;
		while (i <= 5)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				year = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				month = Short.parseShort(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				day = Short.parseShort(tempVar3);
			}
			odd = year % 400 == 0 || year % 4 == 0 && year % 100 != 0?1:0;
			switch (month)
			{
				case 12:
					result += 30;
				case 11:
					result += 31;
				case 10:
					result += 30;
				case 9:
					result += 31;
				case 8:
					result += 31;
				case 7:
					result += 30;
				case 6:
					result += 31;
				case 5:
					result += 30;
				case 4:
					result += 31;
				case 3:
					result += 28;
				case 2:
					result += 31;
				case 1:
					;
			}
			if (month >= 3)
			{
				result += odd;
			}
			result += day;
			System.out.printf("%hd\n",result);
			result = 0;
			i++;
		}
		return (0);
	}



}

