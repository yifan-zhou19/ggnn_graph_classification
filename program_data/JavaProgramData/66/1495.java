package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
	   int year;
	   int month;
	   int day;
	   int i;
	   int temp = 0;
	   int[] yue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   String[] week = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
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
	   sum += (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 + year - 1;
	   if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	   {
	   yue[1] = 29;
	   }
	   for (i = 0 ; i <= month - 2;i++)
	   {
	   sum += yue[i];
	   }
	   sum = sum + day - 1;
	   sum %= 7;
	   System.out.printf("%s",week[sum]);
	}

}

