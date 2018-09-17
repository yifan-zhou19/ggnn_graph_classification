package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
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

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			if (month == 1)
			{
				n = day;
				System.out.printf("%d",n);
			}
			if (month == 2)
			{
				n = 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 3)
			{
				n = 31 + 29 + day;
				System.out.printf("%d",n);
			}
			if (month == 4)
			{
				n = 31 + 29 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 5)
			{
				n = 31 + 29 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
			if (month == 6)
			{
				n = 31 + 29 + 31 + 30 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 7)
			{
				n = 31 + 29 + 31 + 30 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
			if (month == 8)
			{
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 9)
			{
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 10)
			{
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
			if (month == 11)
			{
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 12)
			{
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
		}
		else
		{
			if (month == 1)
			{
				n = day;
				System.out.printf("%d",n);
			}
			if (month == 2)
			{
				n = 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 3)
			{
				n = 31 + 28 + day;
				System.out.printf("%d",n);
			}
			if (month == 4)
			{
				n = 31 + 28 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 5)
			{
				n = 31 + 28 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
			if (month == 6)
			{
				n = 31 + 28 + 31 + 30 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 7)
			{
				n = 31 + 28 + 31 + 30 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
			if (month == 8)
			{
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 9)
			{
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 10)
			{
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
			if (month == 11)
			{
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				System.out.printf("%d",n);
			}
			if (month == 12)
			{
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				System.out.printf("%d",n);
			}
		}
	}

}

