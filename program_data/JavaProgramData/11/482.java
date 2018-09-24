package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int real;
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
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			   if (month == 1)
			   {
				   System.out.printf("%d",day);
			   }
			   if (month == 2)
			   {
				   real = 31 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 3)
			   {
				   real = 31 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 4)
			   {
				   real = 31 + 29 + 31 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 5)
			   {
				   real = 31 * 2 + 30 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 6)
			   {
				   real = 31 * 3 + 30 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 7)
			   {
				   real = 31 * 3 + 30 * 2 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 8)
			   {
				   real = 31 * 4 + 30 * 2 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 9)
			   {
				   real = 31 * 5 + 30 * 2 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 10)
			   {
				   real = 31 * 5 + 30 * 3 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 11)
			   {
				   real = 31 * 6 + 30 * 3 + 29 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 12)
			   {
				   real = 31 * 6 + 30 * 4 + 29 + day;
				   System.out.printf("%d",real);
			   }

		}
		   else
		   {
			   if (month == 1)
			   {
				   System.out.printf("%d",day);
			   }
			   if (month == 2)
			   {
				   real = 31 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 3)
			   {
				   real = 31 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 4)
			   {
				   real = 31 + 28 + 31 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 5)
			   {
				   real = 31 * 2 + 30 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 6)
			   {
				   real = 31 * 3 + 30 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 7)
			   {
				   real = 31 * 3 + 30 * 2 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 8)
			   {
				   real = 31 * 4 + 30 * 2 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 9)
			   {
				   real = 31 * 5 + 30 * 2 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 10)
			   {
				   real = 31 * 5 + 30 * 3 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 11)
			   {
				   real = 31 * 6 + 30 * 3 + 28 + day;
				   System.out.printf("%d",real);
			   }
			   if (month == 12)
			   {
				   real = 31 * 6 + 30 * 4 + 28 + day;
				   System.out.printf("%d",real);
			   }
		   }
	}
}

