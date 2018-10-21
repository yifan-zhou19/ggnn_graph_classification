package <missing>;

public class GlobalMembers
{
	  public static int[] day_month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  public static int sum_day(int month,int day)
	  {
		  int i;
		  for (i = 0;i < month;i++)
		  {
		  day = day + day_month[i];
		  }
		  return (day);
	  }
	  public static int leap(int year)
	  {
		  int leap;
		  leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		  return (leap);
	  }
	  public static int Main()
	  {
		  int year;
		  int month;
		  int day;
		  int days;
		  int a;

		  for (a = 1;a <= 5;a++)
		  {
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


		  days = sum_day(month, day);
		  if (leap(year) != 0 && month >= 3)
		  {
			  days = days + 1;
		  }
		  System.out.printf("%d\n",days);
		  }

	  return 0;
	  }

}

