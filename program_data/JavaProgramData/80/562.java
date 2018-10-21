package <missing>;

public class GlobalMembers
{
	public static int day_of_year(int n)
	{
	  if (n % 400 == 0)
	  {
		  return 366;
	  }
	  if ((n % 4 == 0) && (n % 100 != 0))
	  {
		  return 366;
	  }
	  else
	  {
		  return 365;
	  }
	}

	public static int day_of_month(int month,int year)
	{
	 if (month == 2)
	 {
	  if (day_of_year(year) == 366)
	  {
		  return 29;
	  }
	  else
	  {
		  return 28;
	  }
	 }
	 if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
	 {
		 return 30;
	 }
	 else
	 {
		 return 31;
	 }
	}

	public static int Main()
	{
	 int year1;
	 int year2;
	 int month1;
	 int month2;
	 int day1;
	 int day2;
	 int i;
	 int j;
	 int sum;
	 int sumyear;
	 int summonth1;
	 int summonth2;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 year1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 month1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 day1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead("\n");
	 if (tempVar4 != null)
	 {
		 year2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 month2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ");
	 if (tempVar6 != null)
	 {
		 day2 = Integer.parseInt(tempVar6);
	 }
	 sum = sumyear = summonth1 = summonth2 = 0;
	 for (i = year1;i < year2;i++)
	 {
	  sumyear += day_of_year(i);
	 }
	 for (i = 1;i < month1;i++)
	 {
	 summonth1 = summonth1 + day_of_month(i, year1);
	 }
	 for (i = 1;i < month2;i++)
	 {
	 summonth2 = summonth2 + day_of_month(i, year2);
	 }
	 sum = sumyear + summonth2 + day2 - summonth1 - day1;
	 System.out.printf("%d",sum);
	 String tempVar7 = ConsoleInput.scanfRead();
	 if (tempVar7 != null)
	 {
		 i = Integer.parseInt(tempVar7);
	 }
	 return 0;
	}
}

