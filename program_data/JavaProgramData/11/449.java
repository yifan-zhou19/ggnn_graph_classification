package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int n;
		int m = 0;
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
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					n = 29;
				}
				else
				{
					n = 28;
				}
			}
			else
			{
				n = 29;
			}
		}
		else
		{
			n = 28;
		}
		if (month == 1)
		{
			System.out.printf("%d",day);
		}
		if (month == 2)
		{
			m = 31 + day;
			System.out.printf("%d",m);
		}
		if (month == 3)
		{
			m = 31 + n + day;
			System.out.printf("%d",m);
		}
		if (month == 4)
		{
			m = 31 + n + 31 + day;
			System.out.printf("%d",m);
		}
		if (month == 5)
		{
			m = 31 + n + 31 + 30 + day;
			System.out.printf("%d",m);
		}
		if (month == 6)
		{
			m = 31 + n + 31 + 30 + 31 + day;
			System.out.printf("%d",m);
		}
		if (month == 7)
		{
			m = 31 + n + 31 + 30 + 31 + 30 + day;
			System.out.printf("%d",m);
		}
		if (month == 8)
		{
			m = 31 + n + 31 + 30 + 31 + 30 + 31 + day;
			System.out.printf("%d",m);
		}
		if (month == 9)
		{
			m = 31 + n + 31 + 30 + 31 + 30 + 31 + 31 + day;
			System.out.printf("%d",m);
		}
		if (month == 10)
		{
			m = 31 + n + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			System.out.printf("%d",m);
		}
		if (month == 11)
		{
			m = 31 + n + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			System.out.printf("%d",m);
		}
		if (month == 12)
		{
			m = 31 + n + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			System.out.printf("%d",m);
		}
	}



}

