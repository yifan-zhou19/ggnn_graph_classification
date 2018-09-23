package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int sum_day = new int(int,int);
	 int leap = int year;
	 int[] year = new int[5];
	 int[] month = new int[5];
	 int[] day = new int[5];
	 int[] days = new int[5];
	 for (i = 0;i < 5;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 year[i] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 month[i] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 day[i] = Integer.parseInt(tempVar3);
	 }
	 }
	 for (i = 0;i < 5;i++)
	 {
		 days[i] = sum_day(month[i], day[i]);
	 if (leap(year[i]) != 0 && month[i] >= 3)
	 {
	  days[i] = days[i] + 1;
	 }
	 System.out.printf("%d\n",days[i]);
	 }
	}
	   public static int sum_day(int month,int day)
	   {
		   int[] day_tab = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		for (i = 1;i < month;i++)
		{
		  day += day_tab[i];
		}
		return (day);
	   }

	  public static int leap(int year)
	  {
		   int leap;
		leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return (leap);
	  }

}

