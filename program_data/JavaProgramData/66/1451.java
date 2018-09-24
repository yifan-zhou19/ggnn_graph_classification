package <missing>;

public class GlobalMembers
{
	public static final int[] date = {0, 5, 3, 1};
	public static int isleapyear(int x)
	{
	 int mark = 0;
	 if (x % 400 == 0 || (x % 100 != 0 && x % 4 == 0))
	 {
	  mark = 1;
	 }
	 return mark;
	}
	public static void prt(int x)
	{
	 switch (x)
	 {
	 case 0 :
		 System.out.print("Mon.");
		 break;
	 case 1 :
		 System.out.print("Tue.");
		 break;
	 case 2 :
		 System.out.print("Wed.");
		 break;
	 case 3 :
		 System.out.print("Thu.");
		 break;
	 case 4 :
		 System.out.print("Fri.");
		 break;
	 case 5 :
		 System.out.print("Sat.");
		 break;
	 case 6 :
		 System.out.print("Sun.");
		 break;
	 }
	}
	public static final int[][] monthday =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static final int[] yearday = {365, 366};
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
	 year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int daycount = 0;
	  int temp;
	 temp = isleapyear(year);
	 int temp0 = (year - 1) / 100 % 4;
	 year = (year - 1) % 100 + 1;
	 if (year == 0)
	 {
		 year = 100;
	 }
	 for (int i = 0;i < year - 1;i++)
	 {
	  daycount += yearday[isleapyear(i + 1)];
	 }
	 for (int j = 0;j < month - 1;j++)
	 {
	  daycount += monthday[temp][j];
	 }
	 daycount += day;
	 int ans;
	 ans = (date[temp0] + daycount - 1) % 7;
	 prt(ans);
	 return 0;
	}
}

