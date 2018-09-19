package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int year;
	 int month;
	 int date;
	 int count = 0;
	 int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 date = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i < month;i++)
	 {
	  count += day[i];
	 }
	 count += date;
	 if (month > 2)
	 {
	  if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
	  {
	   count++;
	  }
	 }
	 System.out.print(count);
	 return 0;
	}
}

