package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int day;
	 int month;
	 int year;
	 int i;
	 int days = 0;
	 int s;
	 int k;
	 int[] mont = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
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
	 if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
	 {
	  mont[2] = 29;
	 }
	 else
	 {
	  mont[2] = 28;
	 }
	 for (i = 0;i < month;i++)
	 {
	  days += mont[i];
	 }
	 days += day;
	 s = year - 1 + (int)((year - 1) / 4) - (int)((year - 1) / 100) + (int)((year - 1) / 400) + days;
	 k = s % 7;
	 System.out.printf("%s",week[k]);
	 return 0;
	}
}

