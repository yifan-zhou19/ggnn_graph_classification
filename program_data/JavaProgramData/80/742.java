public class date
{
   public int year;
   public int month;
   public int day;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 date date1 = new date();
	 date date2 = new date();
	 int days;
	 int days1 = 0;
	 int days2 = 0;
	 int[] daytab = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 date1.year = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 date1.month = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 date1.day = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 date2.year = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 date2.month = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 date2.day = Integer.parseInt(tempVar6);
	 }
	 for (i = 0;i < date1.month;i++)
	 {
	  days1 += daytab[i];
	 }

	 if (((date1.year % 4 == 0 && date1.year % 100 != 0) || (date1.year % 400 == 0)) && date1.month > 2)
	 {
	  days1++;
	 }
	 days1 += date1.day;

	 if (date1.year <= date2.year)
	 {
	 for (i = date1.year;i < date2.year;i++)
	 {
	  days2 += 365;
	  if (((i % 4) == 0 && (i % 100) != 0) || (i % 400 == 0))
	  {
	   days2++;
	  }
	 }
	 }
	 else
	 {
	 for (i = date2.year;i < date1.year;i++)
	 {
	  days1 += 365;
	  if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
	  {
	   days1++;
	  }
	 }
	 }

	 for (i = 0;i < date2.month;i++)
	 {
	  days2 += daytab[i];
	 }

	 if ((date2.year % 4 == 0 && date2.year % 100 != 0) || (date2.year % 400 == 0) && date2.month > 2)
	 {
	  days2++;
	 }
	 days2 += date2.day;

	 days = Math.abs(days2 - days1);

	 System.out.printf("%d\n",days);
	 return 0;
	}
}

