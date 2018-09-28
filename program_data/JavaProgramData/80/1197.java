package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
	 int[] month = new int[13];
	 month[1] = 31;
	 month[3] = 31;
	 month[5] = 31;
	 month[7] = 31;
	 month[8] = 31;
	 month[10] = 31;
	 month[12] = 31;
	 month[4] = 30;
	 month[6] = 30;
	 month[9] = 30;
	 month[11] = 30;
	 int day_number;
	 int that_year_day1 = 0;
	 int that_year_day2 = 0;
	 day_number = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 year1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 month1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 day1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 year2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 month2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 day2 = Integer.parseInt(tempVar6);
	 }
	 for (i = year1;i <= year2 - 1;i++)
	 {
		 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		 {
		  month[2] = 29;
		 }
	   else
	   {
		   month[2] = 28;
	   }
	   for (j = 1;j <= 12;j++)
	   {
		   day_number = day_number + month[j];
	   }
	 }
	 if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
	 {
			month[2] = 29;
	 }
	 else
	 {
		 month[2] = 28;
	 }
	 for (k = 1;k <= month1 - 1;k++)
	 {
		 that_year_day1 += month[k];
	 }
	 that_year_day1 += day1;
	 if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
	 {
			month[2] = 29;
	 }
	 else
	 {
		 month[2] = 28;
	 }
	 for (k = 1;k <= month2 - 1;k++)
	 {
		 that_year_day2 += month[k];
	 }
	 that_year_day2 += day2;
	 day_number = day_number - that_year_day1 + that_year_day2;
	 System.out.printf("%d",day_number);
	}
}

