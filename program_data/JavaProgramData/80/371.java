package <missing>;

public class GlobalMembers
{
	//???????????
	//2010?11?29?
	//1000012753 ???
	public static int countday(int year, int month, int day)
	{
		int count;
		 switch (month)
		 {
		case 1:
			count = day;
			break;
		case 2:
			count = (31 + day);
			break;
		case 3:
			count = (60 + day);
			break;
		case 4:
			count = (91 + day);
			break;
		case 5:
			count = (121 + day);
			break;
		case 6:
			count = (152 + day);
			break;
		case 7:
			count = (182 + day);
			break;
		case 8:
			count = (213 + day);
			break;
		case 9:
			count = (244 + day);
			break;
		case 10:
			count = (274 + day);
			break;
		case 11:
			count = (305 + day);
			break;
		case 12:
			count = (335 + day);
			break;
		 }
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return count;
		}
		else
		{
			if (month <= 2)
			{
				return count;
			}
			else
			{
				return (count - 1);
			}
		}
	}
	public static int countyear(int year)
	{
		int i;
		int countyear = 0;
		for (i = 1; i <= year; ++i)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				countyear++;
			}
		}
		return (countyear * 366 + (year - countyear) * 365);
	}
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int count1;
		int count2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count1 = countday(y1, m1, d1);
		count2 = countday(y2, m2, d2);
		count1 += countyear(y1 - 1);
		count2 += countyear(y2 - 1);
		System.out.print(count2 - count1);
		System.out.print("\n");
		return 0;
	}

}

