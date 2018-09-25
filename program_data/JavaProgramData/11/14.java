package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
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
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
		{
			if (month == 1)
			{
			System.out.printf("%d",day);
			}
		else if (month == 2)
		{
			System.out.printf("%d",day + 31);
		}
		else if (month == 3)
		{
			System.out.printf("%d",day + 59);
		}
		else if (month == 4)
		{
			System.out.printf("%d",day + 90);
		}
		else if (month == 5)
		{
			System.out.printf("%d",day + 120);
		}
		else if (month == 6)
		{
			System.out.printf("%d",day + 151);
		}
		else if (month == 7)
		{
			System.out.printf("%d",day + 181);
		}
		else if (month == 8)
		{
			System.out.printf("%d",day + 212);
		}
		else if (month == 9)
		{
			System.out.printf("%d",day + 242);
		}
		else if (month == 10)
		{
			System.out.printf("%d",day + 273);
		}
		else if (month == 11)
		{
			System.out.printf("%d",day + 304);
		}
		else if (month == 12)
		{
			System.out.printf("%d",day + 334);
		}
		}
		else
		{
		if (month == 1)
		{
			System.out.printf("%d",day);
		}
		else if (month == 2)
		{
			System.out.printf("%d",day + 31);
		}
		else if (month == 3)
		{
			System.out.printf("%d",day + 59 + 1);
		}
		else if (month == 4)
		{
			System.out.printf("%d",day + 90 + 1);
		}
		else if (month == 5)
		{
			System.out.printf("%d",day + 120 + 1);
		}
		else if (month == 6)
		{
			System.out.printf("%d",day + 151 + 1);
		}
		else if (month == 7)
		{
			System.out.printf("%d",day + 182);
		}
		else if (month == 8)
		{
			System.out.printf("%d",day + 213);
		}
		else if (month == 9)
		{
			System.out.printf("%d",day + 243);
		}
		else if (month == 10)
		{
			System.out.printf("%d",day + 274);
		}
		else if (month == 11)
		{
			System.out.printf("%d",day + 305);
		}
		else if (month == 12)
		{
			System.out.printf("%d",day + 335);
		}
		}


	}


}

